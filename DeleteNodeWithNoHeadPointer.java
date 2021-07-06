public class DeleteNodeWithNoHeadPointer
{
    void deleteNode(Node del)
    {
         if(null==del) return;
         del.data=del.next.data;
         del.next=del.next.next;
    }
}
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
