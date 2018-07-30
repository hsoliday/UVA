import java.util.LinkedList;
import java.util.Scanner;

public class UVA336 {

	public static void main(String[] args) {
		Graph g = new Graph();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 0;i<num;i++)
		{
			int tmp1=scan.nextInt();
			int tmp2=scan.nextInt();
			if(!g.contains(tmp1))
			{
				g.addNode(tmp1);
			}
			if(!g.contains(tmp2))
			{
				g.addNode(tmp2);
			}
			if(!g.get(tmp1).isAdjacent(tmp2))
			{
				g.get(tmp1).adjacentNodes.add(g.get(tmp2));
				g.get(tmp2).adjacentNodes.add(g.get(tmp1));
			}
		}
		
	}

}
class Graph
{
	LinkedList<Node> nodes;
	public Graph() 
	{
		nodes = new LinkedList<Node>();
	}
	public void addNode(int i)
	{
		nodes.add(new Node(i));
	}
	public void connect(int i, int k)
	{
		get(i).adjacentNodes.add(get(k));
		get(k).adjacentNodes.add(get(i));
	}
	public Node get(int i)
	{
		for(Node n:nodes)
		{
			if(n.number==i)
			{
				return n;
			}
		}
		return null;
	}
	public boolean contains(int i)
	{
		if(get(i)==null)
		{
			return false;
		}
		return true;
	}
	
}
class Node
{
	public int number;
	public LinkedList<Node> adjacentNodes;
	public Node(int i) 
	{
		adjacentNodes =new LinkedList<Node>();
		number = i;
	}
	public boolean isAdjacent(int i)
	{
		for(Node n : adjacentNodes)
		{
			if(n.number==i)
			{
				return true;
			}
		}
		return false;
	}
}
