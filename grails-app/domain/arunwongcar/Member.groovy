package arunwongcar

class Member {

  String loginId
  String password
  Date dateCreated

  String firstname
  String lastname
  String personalId
  String tel
  String email

  int creditRemain = 100

  static hasMany = [cars:Car]

  static constraints = {
  loginId size: 3..20, unique: true, nullable: false
  password size: 6..8, nullable: false
  dateCreated()
  firstname nullable: false
  lastname nullable: false
  personalId size: 13..13, nullable: false
  tel size: 10..10, nullable: false
  email nullable: false
  creditRemain()
  }

  String toString() { return loginId }

}
