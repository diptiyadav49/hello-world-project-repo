package com.sapient.asde.ui;

public class SumAndAvg {
    public static void main(String[] args) {
        int sum=0;
        try{
            if(args.length == 0){
                throw new IllegalArgumentException("Enter commandline arguments");
            }
            for(int i=0;i<args.length;i++){
                sum += Integer.parseInt(args[i]);
            }
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

        catch(IllegalArgumentException e){
            e.printStackTrace();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
