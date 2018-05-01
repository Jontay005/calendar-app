package org.launchcode.calendarapp.models.data;

import org.launchcode.calendarapp.models.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface  BookingDao extends CrudRepository<Booking, Integer> {


}
