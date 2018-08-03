
## 可以自动完成映射的类型（@Basic）
- Java primitive types (boolean, int, etc)
- wrappers for the primitive types (java.lang.Boolean, java.lang.Integer, etc)
- java.lang.String

- java.math.BigInteger

- java.math.BigDecimal

- java.util.Date

- java.util.Calendar

- java.sql.Date

- java.sql.Time

- java.sql.Timestamp

- byte[] or Byte[]

- char[] or Character[]

- enums

- Serilazable

## 附类型转换表

<table class="tableblock frame-all grid-all spread">
<caption class="title">Table 1. Standard BasicTypes</caption>
<colgroup>
<col style="width: 25%;">
<col style="width: 25%;">
<col style="width: 25%;">
<col style="width: 25%;">
</colgroup>
<thead>
<tr>
<th class="tableblock halign-left valign-top">Hibernate type (org.hibernate.type package)</th>
<th class="tableblock halign-left valign-top">JDBC type</th>
<th class="tableblock halign-left valign-top">Java type</th>
<th class="tableblock halign-left valign-top">BasicTypeRegistry key(s)</th>
</tr>
</thead>
<tbody>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">StringType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">string, java.lang.String</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">MaterializedClob</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">materialized_clob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">TextType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">LONGVARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">text</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CharacterType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">char, java.lang.Character</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">char, java.lang.Character</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">BooleanType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">BIT</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">boolean, java.lang.Boolean</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">boolean, java.lang.Boolean</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">NumericBooleanType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">INTEGER, 0 is false, 1 is true</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">boolean, java.lang.Boolean</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">numeric_boolean</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">YesNoType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CHAR, 'N'/'n' is false, 'Y'/'y' is true. The uppercase value is written to the database.</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">boolean, java.lang.Boolean</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">yes_no</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">TrueFalseType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CHAR, 'F'/'f' is false, 'T'/'t' is true. The uppercase value is written to the database.</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">boolean, java.lang.Boolean</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">true_false</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">ByteType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">TINYINT</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">byte, java.lang.Byte</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">byte, java.lang.Byte</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">ShortType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">SMALLINT</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">short, java.lang.Short</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">short, java.lang.Short</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">IntegerTypes</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">INTEGER</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">int, java.lang.Integer</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">int, java.lang.Integer</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">LongType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">BIGINT</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">long, java.lang.Long</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">long, java.lang.Long</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">FloatType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">FLOAT</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">float, java.lang.Float</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">float, java.lang.Float</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">DoubleType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">DOUBLE</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">double, java.lang.Double</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">double, java.lang.Double</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">BigIntegerType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NUMERIC</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.math.BigInteger</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">big_integer, java.math.BigInteger</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">BigDecimalType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NUMERIC</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.math.BigDecimal</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">big_decimal, java.math.bigDecimal</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">TimestampType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">TIMESTAMP</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.Timestamp</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">timestamp, java.sql.Timestamp</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">TimeType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">TIME</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.Time</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">time, java.sql.Time</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">DateType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">DATE</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.Date</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">date, java.sql.Date</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CalendarType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">TIMESTAMP</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.Calendar</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">calendar, java.util.Calendar</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CalendarDateType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">DATE</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.Calendar</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">calendar_date</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CalendarTimeType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">TIME</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.Calendar</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">calendar_time</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CurrencyType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.Currency</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">currency, java.util.Currency</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">LocaleType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.Locale</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">locale, java.utility.locale</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">TimeZoneType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR, using the TimeZone ID</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.TimeZone</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">timezone, java.util.TimeZone</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">UrlType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.net.URL</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">url, java.net.URL</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">ClassType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR (class FQN)</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.Class</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">class, java.lang.Class</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">BlobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">BLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.Blob</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">blob, java.sql.Blob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">ClobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.Clob</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">clob, java.sql.Clob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">BinaryType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARBINARY</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">byte[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">binary, byte[]</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">MaterializedBlobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">BLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">byte[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">materialized_blob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">ImageType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">LONGVARBINARY</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">byte[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">image</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">WrapperBinaryType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARBINARY</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.Byte[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">wrapper-binary, Byte[], java.lang.Byte[]</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CharArrayType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">char[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">characters, char[]</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CharacterArrayType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.Character[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">wrapper-characters, Character[], java.lang.Character[]</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">UUIDBinaryType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">BINARY</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.UUID</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">uuid-binary, java.util.UUID</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">UUIDCharType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">CHAR, can also read VARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.UUID</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">uuid-char</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">PostgresUUIDType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">PostgreSQL UUID, through Types#OTHER, which complies to the PostgreSQL JDBC driver definition</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.util.UUID</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">pg-uuid</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">SerializableType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">VARBINARY</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">implementors of java.lang.Serializable</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">Unlike the other value types, multiple instances of this type are registered. It is registered once under java.io.Serializable, and registered under the specific java.io.Serializable implementation class names.</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">StringNVarcharType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NVARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">nstring</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">NTextType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">LONGNVARCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">ntext</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">NClobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NCLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.sql.NClob</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">nclob, java.sql.NClob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">MaterializedNClobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NCLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.String</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">materialized_nclob</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">PrimitiveCharacterArrayNClobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">char[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">N/A</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CharacterNCharType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NCHAR</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.Character</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">ncharacter</p></td>
</tr>
<tr>
<td class="tableblock halign-left valign-top"><p class="tableblock">CharacterArrayNClobType</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">NCLOB</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">java.lang.Character[]</p></td>
<td class="tableblock halign-left valign-top"><p class="tableblock">N/A</p></td>
</tr>
</tbody>
</table>