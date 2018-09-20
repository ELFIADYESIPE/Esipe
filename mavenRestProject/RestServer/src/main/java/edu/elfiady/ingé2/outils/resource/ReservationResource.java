package edu.elfiady.ingé2.outils.resource;



import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.elfiady.ingé2.outils.representation.Reservation;
import edu.elfiady.ingé2.outils.reservation.GestionReservation;



/**
 * @author elfiady
 *
 */
@Path("/reservation")
@Singleton
public class ReservationResource {
	
	GestionReservation gestionReservation = new GestionReservation();

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/authenticate/{userId}")
	public Response authenticate(@PathParam("userId") final long user_Id) {
		return Response.ok(new Long(user_Id).toString()).build();
	}


	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/{id}/addReservation")
	public Response addReservation(@PathParam("id") final long Id, @QueryParam("idReservation") final long reservationId,
			@QueryParam("userName") final String clientName, @QueryParam("descReservation") final String desc) {
		final Reservation reservation = new Reservation();
		reservation.setId_Reservation(reservationId);
		reservation.setNom(clientName);

		return Response.ok(reservation).build();
	}

	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("getEvent/{reservationId}")
	public Response getReservation(@PathParam("eventId") final long reservationId) {
		Reservation reservation = gestionReservation.getReservation(reservationId);
		return Response.ok(reservation.toString()).build();
	}

}
