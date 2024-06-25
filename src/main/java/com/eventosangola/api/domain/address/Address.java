package com.eventosangola.api.domain.address;

import com.eventosangola.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.SpringVersion;

import java.util.UUID;

@Table(name="address")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private UUID id;

    private String country;
    private String province;
    private String municipe;
    private String street;

    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;
}
