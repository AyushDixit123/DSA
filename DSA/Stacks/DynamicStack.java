package Stacks;

public class DynamicStack extends CustomStack{


  public DynamicStack(){
    super(); // it will call CustomStack
  }

  public DynamicStack(int size){
    super(size) // it will call CustomStack(int size)
  }

  //the only problem we are here to solve is that stack has dynamic space so this stack would contain all properties of customstack
  //we will override on push to change its properties

@override
public boolean push(int item){

  if(this.isFull()){
    //double the array sizerivate
    int[] temp = new int[data.length*2];

    //copy all previous items of data

    for(int i = 0 ; i< data.length ; i++){
      temp[i] = data[i];
    }
    data = temp;
    //changing the refrence of variable from data to temp


    //now data is pointing to array of double size
//super.push(item) // doubt
  }

}




}

