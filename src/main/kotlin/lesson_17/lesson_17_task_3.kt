package lesson_17

class Folder(private val name: String, private val numOfFiles: Int, private val isSecret: Boolean) {

    val folderName: String
        get() = if (isSecret) "Скрытая папка" else name

    val numOfFilesInFolder: Int
        get() = if (isSecret) 0 else numOfFiles
}

fun main() {

    val secretFolder = Folder("Секретная папка", 10, true)

    println(secretFolder.folderName)
    println(secretFolder.numOfFilesInFolder)
}