package imc;

import controller.IMCcontroller;
import model.IMCmodel;


/**
 *
 * @author alexandreluisrigotti
 */
public class sistema
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        IMCmodel imcModel = new IMCmodel();
        imcModel.setPeso(70);
        imcModel.setAlgura(1.81);
        
        IMCcontroller imcController = new IMCcontroller();
        double valorIMC = imcController.calculoIMC(imcModel);
        String resultadoIMC = imcController.resultadoIMC();

        System.out.println("valorIMC: " + valorIMC + " resultadoIMC:" + resultadoIMC);
    }
}