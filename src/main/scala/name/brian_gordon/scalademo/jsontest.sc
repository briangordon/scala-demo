import name.brian_gordon.scalademo.JsonArray
import name.brian_gordon.scalademo.JsonObject
import name.brian_gordon.scalademo.JsonSerializer
import name.brian_gordon.scalademo.JsonString
val sigfigTopGames = JsonObject(Map(
    "brian" -> JsonArray(Seq(JsonString("TF2"), JsonString("CSGO"), JsonString("L4D2"))),
    "alex" -> JsonArray(Seq(JsonString("Company of Heroes"), JsonString("Saints Row 3"), JsonString("Payday 2"))),
    "daniel" -> JsonArray(Seq(JsonString("Dota 2"), JsonString("Dark Souls 2"), JsonString("Skyrim"))),
    "benny" -> JsonArray(Seq(JsonString("XCOM"), JsonString("Portal"), JsonString("Borderlands 2")))
))

JsonSerializer(sigfigTopGames)