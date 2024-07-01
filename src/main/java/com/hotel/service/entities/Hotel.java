package com.hotel.service.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "hotels")
public class Hotel {
	@Id
	@Column(name = "hotel_id")
	private String hotelId;
	@Column(name = "hotel_name")
	private String hotelName;
	@Column(name = "hotel_address")
	private String hotelAddress;
}
