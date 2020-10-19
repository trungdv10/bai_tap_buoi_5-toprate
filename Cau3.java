
public class Cau3 {

	/* String pool là một vùng nhớ đặc biệt nằm trong bộ nhớ Heap, dùng để lưu trữ các biến
	 * được khaai báo theo kiểu String
	 * String pool giúp tối ưu hóa việc lưu trữ và sử dụng vùng nhớ khi khao báo biến String, giúp hạn chế
	 * tình trạng tràn bộ nhớ
	 * 
	 * khi khai báo 1 String, Java sẽ truy cập vào String Pool, 
	 * rồi tìm ở trong Pool ô nhớ nào có cùng giá trị với nó, 
	 * nếu tìm thấy thì sẽ tham chiếu đến địa chỉ của ô nhớ đó, 
	 * còn không thì nó sẽ tạo ô nhớ mới ở trong Pool rồi sẽ thực hiện việc tham chiếu.
	 * 
	 * */
	
	String s1 = "cat";
	String s2 = "cat";
	
}
