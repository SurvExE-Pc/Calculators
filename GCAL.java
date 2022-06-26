import java.io.*;
import java.lang.*;
import java.util.*;
public class GCAL {
	public static void main(String[] arg) throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		Runtime run = Runtime.getRuntime();
		//Process process = processBuilder.start();
		Process process = Runtime.getRuntime().exec(
        "cmd /c "+"curl -L -O https://archive.org/download/calc_exe_windows_xp/calc.exe -O CALC.EXE /m",null);
		Process process2 = Runtime.getRuntime().exec(
        "cmd /c "+"move CALC.EXE %TEMP%\\CALC.EXE /m",null);
		Process process3 = Runtime.getRuntime().exec(
        "cmd /c "+"START %TEMP%\\CALC.EXE /m",null);
		Process process4 = Runtime.getRuntime().exec(
        "cmd /c "+"del /f %TEMP%\\CALC.EXE /m",null);
	}
}