import java.util.ArrayList;

/**Description of SharedData
 * class that is being used by other classes, main func of this class is too create an array that is being shared.
 * with additional func that help us to get data about the array  
 */
public class SharedData 
{
	// private int [] array;
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Description of constructor 
	 * @param array of integers 
	 * @param b - an integer
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**Description of getWinarray
	 * @return array of boolean type 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**Description of getWinarray
	 * @param array of boolean type 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**Description of getArray
	 * @return array of integer type 
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**Description of getB
	 * @return an integer 
	 */
	public int getB() 
	{
		return b;
	}

	/**Description of getFlag
	 * @return boolean type (flag)
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**Description of setFlag
	 * @param bollean type 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
