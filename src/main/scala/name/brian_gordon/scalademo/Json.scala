package name.brian_gordon.scalademo

/**
 * @author Brian Gordon
 */
sealed trait JsonValue
case class JsonBoolean(value: Boolean) extends JsonValue
case class JsonNumber(value: BigDecimal) extends JsonValue
case class JsonString(value: String) extends JsonValue
case class JsonArray(items: Seq[JsonValue]) extends JsonValue
case class JsonObject(fields: Map[String, JsonValue]) extends JsonValue

object JsonSerializer {
    def apply(value: JsonValue): String =
        value match {
            case JsonBoolean(value) => value.toString
            case JsonNumber(value) => value.toString
            case JsonString(value) => "\"" + value + "\""
            case JsonArray(items) => items.map(apply).mkString("[", ",", "]")
            case JsonObject(fields) => {
                fields.mapValues(apply).toSeq.map {
                    case (key, value) => key + ": " + value
                }.mkString("{", ",", "}")
            }
        }
}