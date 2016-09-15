package arunwongcar

class Car {

  String carId
  String chassisNumber
  String make
  String model
  int year
  String type
  String gear
  int price
  String photoUrl
  Date dateCreated

  static belongsTo = [seller:Member]
  static mapping = {
      posts sort:'dateCreated'
  }

  static constraints = {

  carId size: 7..10, unique: true, nullable: false
  chassisNumber size: 11..11, unique: true, nullable: false
  make nullable: false
  model nullable: false
  year size: 4..4, nullable: false
  type nullable: false
  gear nullable: false
  price nullable: false
  photoUrl()
  dateCreated()
  }


}
