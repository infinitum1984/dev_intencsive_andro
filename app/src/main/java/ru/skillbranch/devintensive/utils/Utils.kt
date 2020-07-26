package ru.skillbranch.devintensive.utils

object Utils {
    fun parsFullName(fullName:String?):Pair<String?,String?>{

        val parts  :List<String>? =  fullName?.split(" ")

        if (fullName.isNullOrEmpty())
            return null to null

        if (fullName.length==1){
            if (fullName==" "){
                return null to null
            }
            return fullName to null
        }
        if (parts?.size==1){
            return parts[0] to null
        }
        val firstName = parts?.get(0);
        val lastName = parts?.get(1)
        return firstName to lastName
    }
    fun toInitials(name:String?, last_name: String?):String?{
        val n="${if (name==null) "" else{if (name.isEmpty() || name==" ") "" else name.substring(0,1)}}"
        val ln="${if (last_name==null) "" else{if (last_name.isEmpty() || last_name==" ") "" else last_name.substring(0,1)}}"
        val out = n+ln;
        if (out.isEmpty())
            return null
        return out.toUpperCase()

    }
    fun transliteration(payload:String,devider:String=" "):String{
        return ""
    }
}