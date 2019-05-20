package com.hendisantika.springbootreservation.repository;

import com.hendisantika.springbootreservation.domain.model.ReservableRoom;
import com.hendisantika.springbootreservation.domain.model.ReservableRoomId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-reservation
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-05-21
 * Time: 05:22
 */
public interface ReservableRoomRepository extends JpaRepository<ReservableRoom, ReservableRoomId> {

    List<ReservableRoom> findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(LocalDate reservedDate);

}