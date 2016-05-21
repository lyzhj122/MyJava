public void send(int numOfMails) throws Exception    {
            
        String message = "";
        System.out.println("Connecting to server ...");
        
        os.writeBytes("HELO\r\n");            
        int status = 0;//HELO already sent to the server
        int count = 0;           
        
        while(true){
            
            message = bufReader.readLine();    
            System.out.println(message);
            
            if(count>=numOfMails)break;
            
            if(message.contains("Aba he")){
                System.out.println("Close the connection");
                break;
            }
            
            System.out.println("Email count: " + count);
                        
            switch (status) {
                        
            case HELO_RECEIVED: //command HELO already accepted by server
                message = bufReader.readLine();                    
                os.writeBytes("MAIL FROM:"+ this.sender + "\r\n");
                status = 1;
                break;                                    
                
            case MAILFROM_RECEIVED : //command MAIL FROM already accepted by server
                os.writeBytes("RCPT TO:"+ this.receiver + "\r\n");
                status = 2;
                break;
                
            case RCPTTO_RECEIVED : //command RCPT TO already accepted by server
                os.writeBytes("DATA\r\n");        
                status = 3;
                break;
                
            case DATA_RECEIVED : //send email body                    
                os.writeBytes(this.body+"\r\n" + "." + "\r\n");
                count++;
                status=1;                
                break;                                
            }                        
        }
            
        os.writeBytes("QUIT\r\n");
        message = bufReader.readLine();    
        System.out.println(message);
        //This code can't run. Maybe something wrong.
        
        System.out.println("Client terminates the connection!");        
    }