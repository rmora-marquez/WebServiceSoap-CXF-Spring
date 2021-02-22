package com.mpersd.soap.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mpersd.soap.webservice.ConversionWS;
import com.mpersd.soap.webservice.ConversionWSImpService;
import com.mpersd.soap.webservice.Moneda;

@Controller
@RequestMapping("/")
public class IndexController {
	private ConversionWSImpService service 
				= new ConversionWSImpService();
	
	@GetMapping
	public String conversionGet(ModelMap modelo){
		return "index";
	}
	@PostMapping
	public String conversionPost(ModelMap modelo,
			@RequestParam("cantidad") double cantidad,
			@RequestParam("moneda") String moneda){
		String origen = "";
		String destino = moneda;
		Double resultado = 0d;
		Moneda divisa = null;
		ConversionWS port = service.getConversionWSImpPort();		
		if(moneda.equals("peso")){
			resultado = port.dolarAPeso(cantidad);
			origen = "dolar";
			divisa = port.getTipoCambio("peso");
		}else{
			resultado = port.pesoADolar(cantidad);
			origen = "peso";
			divisa = port.getTipoCambio("dolar");
		}
		modelo.addAttribute("cantidad", cantidad);
		modelo.addAttribute("moneda", divisa);
		modelo.addAttribute("origen", origen);
		modelo.addAttribute("destino", destino);
		modelo.addAttribute("resultado", resultado);
		return "index";
	}
}
