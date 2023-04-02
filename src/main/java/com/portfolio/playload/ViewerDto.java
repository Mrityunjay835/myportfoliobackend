package com.portfolio.playload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ViewerDto {
	
	@NotEmpty
	private String name;
	@NotEmpty
	@Size(min = 4 , max = 20,message = "please enter the email")
    private String email;
	@Size(min = 3 , max = 30,message = "please enter the email")
	private String subject;
	@Size(min = 4 , max = 1000,message = "please enter the message")
	private String message;


}
