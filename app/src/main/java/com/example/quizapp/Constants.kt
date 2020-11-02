package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica",
            "New Zealand",
            "Denmark",
            "Austria",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_france,
            "Belgium",
            "France",
            "Fiji",
            "Kuwait",
            2
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Palestine",
            "Gerogia",
            "Denmark",
            "Germany",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_philippines,
            "Argentina",
            "Philippines",
            "Tuvalu",
            "Gabon",
            2
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_south_korea,
            "Jordan",
            "South Korea",
            "India",
            "United States",
            2
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_spain,
            "Ireland",
            "Sudan",
            "Armenia",
            "Spain",
            4
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_switzerland,
            "Switzerland",
            "Australia",
            "Denmark",
            "Ethiopia",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_turkey,
            "China",
            "Switzerland",
            "Turkey",
            "Austria",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_united_states,
            "South Korea",
            "Greece",
            "Egypt",
            "United States",
            4
        )
        questionList.add(que10)

        return questionList
    }
}