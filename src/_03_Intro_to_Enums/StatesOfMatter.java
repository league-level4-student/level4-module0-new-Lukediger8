package _03_Intro_to_Enums;

public enum StatesOfMatter {
SOLID(0),
LIQUID(25.55),
GAS(100);
public double celciusTemp;
StatesOfMatter(double celciusTemp){
	this.celciusTemp = celciusTemp;
}
public double convertToFahrenheit() {
	return (celciusTemp * 9/5) + 32;
}
}


