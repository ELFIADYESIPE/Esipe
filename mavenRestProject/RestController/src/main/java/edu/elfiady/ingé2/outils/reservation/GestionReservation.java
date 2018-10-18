/**
 * 
 */
package edu.elfiady.ingé2.outils.reservation;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import edu.elfiady.ingé2.outils.authorization.keycloak.KeycloakClient;
import edu.elfiady.ingé2.outils.representation.Reservation;

/**
 * @author elfiady
 *
 */
public class GestionReservation {

	private Map<Long, Reservation> reservation_List = new HashMap<>();
	private static Logger LOGGER = Logger.getLogger(GestionReservation.class);
	private final KeycloakClient keycloakClient;


	public GestionReservation() {
		keycloakClient = new KeycloakClient();
		org.apache.log4j.BasicConfigurator.configure();
	}

	/**
	 * @param id
	 * @return
	 */
	public Reservation getReservation(long id) {
		return reservation_List.get(id);
	}

	/**
	 * @param reservation
	 * @return
	 */
	public boolean createReservation(Reservation reservation) {

              if (reservation != null) {
		if (getReservation(reservation.getId_Reservation()) == null && keycloakClient.isAuthorizedReservation(reservation)) {
			reservation_List.put(reservation.getId_Reservation(), reservation);
			LOGGER.info("Create reservation was successfully invoked ");
			return true;
		}
		LOGGER.info("Create reservation was fail because an existing resrvation object");
		return false;
             }
             else {
               throw new IllegalArgumentException("bad argument"); 
              }
            
	}
	
	


}
