package controller;

import model.IMCmodel;


/**
 *
 * @author alexandreluisrigotti
 */
public class IMCcontroller
{
    private double imc;
    
    
    public double calculoIMC(IMCmodel imcValues)
    {
        this.imc = imcValues.getPeso() / (imcValues.getAlgura() * imcValues.getAlgura());
        return this.imc;
    }
    
    public String resultadoIMC()
    {
        String resultado = "";
        
        
        if(this.imc < 17.0)
        {
            resultado = "Muito abaixo do peso";
        }else if((this.imc >= 17.0) && (this.imc <= 18.49))
        {
            resultado = "Abaixo do peso";
        }else if((this.imc >= 18.5) && (this.imc <= 24.9))
        {
            resultado = "Normal";
        }else if((this.imc >= 25) && (this.imc <= 29.9))
        {
            resultado = "Sobrepeso";
        }else if((this.imc >= 30) && (this.imc <= 34.9))
        {
            resultado = "Obesidade grau I";
        }else if((this.imc >= 35) && (this.imc <= 39.9))
        {
            resultado = "Obesidade grau II";
        }else if(this.imc >= 40)
        {
            resultado = "Obesidade grau III: mórbida";
        }
        
        return resultado;
    }
}