
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		Arrays.sort(numbers);
		for (int i : numbers) {
			sum += i;
		}
		System.out.println("Dizi elemanlarının ortalaması : " + sum / numbers.length);
		System.out.println("Harmonik seri ortalaması : " + harmonicAverage(numbers.length, numbers));
	}
	public static float harmonicAverage(int len, int[] num)
	{
		//harmonik seri i inci eleman = 1/i+1
		float hSeries = 0;
		for(int i: num)
		{
			hSeries += 1f/i;
		}
	return hSeries/len;
	}
}