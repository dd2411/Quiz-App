package hs.wismar.heartbeat

object Constants {

    const val Mobile_Number : String = "Mobile_Number"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "You want to connect with WiFi or Bluetooth?",

            R.drawable.nfc,
            "Bluetooth", "WiFi",
            2
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "Here is the list of WiFi Networks",

            R.drawable.wifi,
            "DD's", "TpLink",
            1
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "What Would you like to measure?",

            R.drawable.wifi,
            "ECG Signal", "Blood Pressure",
            1
        )
        questionsList.add(que3)

        return questionsList

    }
}