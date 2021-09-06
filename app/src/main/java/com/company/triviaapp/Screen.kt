package com.company.triviaapp

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object FlashCard : Screen("flashcard")
    object ChapterSelect : Screen("chapter_select")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg -> append("/$arg")}
        }
    }
}
