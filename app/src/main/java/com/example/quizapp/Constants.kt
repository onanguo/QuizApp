package com.example.quizapp

object Constants {
    fun getQuestion(): ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","RDC",
            "USA","CHINE",
            1
        )
        questionList.add(que1)
        val que2= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","RDC",
            "USA","CHINE",
            1
        )
        questionList.add(que2)
        val que3= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_brazil,
            "Bresil","RDC",
            "USA","CHINE",
            1
        )
        questionList.add(que3)
        val que4= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_india,
            "Inde","RSA",
            "USA","CHINE",
            1
        )
        questionList.add(que4)
        val que5= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_kuwait,
            "Koweit","RDC",
            "USA","CHINE",
            1
        )
        questionList.add(que5)
        val que6= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_belgium,
            "Belgique","Fiji",
            "USA","CHINE",
            1
        )
        questionList.add(que5)
        val que7= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_fiji,
            "Fiji","Koweit",
            "USA","CHINE",
            1
        )
        questionList.add(que7)
        val que8= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_australia,
            "Australi","new Zelande",
            "USA","CHINE",
            1
        )
        questionList.add(que8)
        val que9= Question(
            1,"Quel pays a comme drapeau celui-ci ?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zelande","Belgique",
            "USA","CHINE",
            1
        )
        questionList.add(que9)

        return questionList
    }
}