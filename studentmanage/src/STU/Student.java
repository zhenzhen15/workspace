package STU;

    import java.sql.*;  
    public class Student {  
        public static void main(String[] args){  
                   // ����������        
            String driver = "com.mysql.jdbc.Driver";  
                   // URLָ��Ҫ���ʵ����ݿ���world        
            String url = "jdbc:mysql://127.0.0.1:3306/student";  
                   // MySQL����ʱ���û���           
            String user = "root";           
            // MySQL����ʱ������          
            String password = "root";  
            String name;  
                    try {               
                     // ������������        
                    Class.forName(driver);  
                        // �������ݿ�       
                   Connection conn = DriverManager.getConnection(url, user, password);  
                       if(!conn.isClosed())          
                      System.out.println("Succeeded connecting to the Database!");  
                      // statement����ִ��SQL���             
                         Statement statement = conn.createStatement();  
                     // Ҫִ�е�SQL���           
                       String sql = "select * from stu1";  
                    // �����       
                      ResultSet rs = statement.executeQuery(sql);  
                    while(rs.next())  {         
                   // ѡ��Name��������     
                   name = rs.getString("name");  
                   int age=rs.getInt("age");
                      // ������              
                      System.out.println(rs.getString("id") + "\t" + name+"\t"+age);           
                 }  
             rs.close();       conn.close();  }   
            catch(ClassNotFoundException e) {  
             System.out.println("Sorry,can`t find the Driver!");              
             e.printStackTrace();  
            } catch(SQLException e) {  
             e.printStackTrace();  
            } catch(Exception e) {  
             e.printStackTrace();  
            }   
            }  
    }  