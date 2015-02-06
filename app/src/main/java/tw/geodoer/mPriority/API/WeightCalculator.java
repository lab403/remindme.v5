package tw.geodoer.mPriority.API;

import java.util.concurrent.TimeUnit;

public class WeightCalculator
{
	private final double meanW = 100000;
    private final double mean = 5 ;
    private final double Tw = 60;
    private final double Lw = 10;
    private final double L_limit = 10;

	public double getTw()
	{
		return this.Tw;
	}
	public double getLw()
	{
		return this.Lw;
	}
	public double getMeanW()
	{
		return this.meanW;
	}
	public double getMean()
	{
		return this.mean;
	}

	public WeightCalculator()
	{

	}
	private int subL(double L)
	{
		if( L <= L_limit )
            return 1;
		else
            return 0;
	}
	public double weight(double T,double L)
	{
        double Tpart = this.getMeanW()*this.getTw()*this.getMean()  / (T + this.getTw()*this.getMean() );

        double Lpart = this.getMeanW()*this.getLw()*this.getMean()  / (L + this.getLw()*this.getMean() );

		return Lpart + Tpart;
	}
	public int getweight(long pT, double pL)
	{

        double T = TimeUnit.MILLISECONDS.toMinutes(pT);
        double L = pL*1000;

        Double result = this.weight(T,L) + this.subL(L)*weight(0,this.getLw());

		return (result==null)? -1: Integer.valueOf( result.intValue() )  ;
	}
}