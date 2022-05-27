package fr.banque;

public interface ICompteremunere {
    public double calculerInteret();

    public void verserInteret();

    public double getTaux();
    public void setTaux(double unTaux) throws Exception;
}
