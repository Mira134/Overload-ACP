class Student {
    int id;
    String name;
    float stipend;
  
    Student(){}
  
    Student(int id, String name){
      this.id = id;
      this.name = name;
    }
  
    Student(int id, String name, float stipend) {
      this.id = id;
      this.name = name;
      this.stipend = stipend;
    }
  
    void displayDetails(){
      System.out.println(this.id + " | " + " | " + this.stipend);
    }
  }