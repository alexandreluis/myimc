package model;

/**
 *
 * @author alexandreluisrigotti
 */
public class IMCmodel
{
    private double peso;
    private double algura;

    
    public IMCmodel(){}
    
    public IMCmodel(double peso, double algura)
    {
        this.peso = peso;
        this.algura = algura;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getAlgura()
    {
        return algura;
    }

    public void setAlgura(double algura)
    {
        this.algura = algura;
    }

    @Override
    public String toString()
    {
        return "IMC{" + "peso=" + peso + ", algura=" + algura + '}';
    }
}