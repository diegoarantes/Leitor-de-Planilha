package br.com.exceljava;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@Builder
public class Cheque {
    private String nomes;
    private String ultomoNome;
    private Date date;
    private String email;
}
		
		
	
 

