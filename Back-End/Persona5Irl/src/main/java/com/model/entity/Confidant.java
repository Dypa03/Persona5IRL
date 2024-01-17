package com.model.entity;

import com.model.enums.ArchetypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class Confidant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="confidant_id")
	private Integer confidantId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private ArchetypeEnum archetype;
	
	private Integer rank;
	
	private String description;
	
}
