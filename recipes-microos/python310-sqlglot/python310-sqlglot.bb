SUMMARY = "An easily customizable SQL parser and transpiler"
DESCRIPTION = "SQLGlot is a no dependency Python SQL parser, transpiler, and optimizer. It can be \
used to format SQL or translate between different dialects like DuckDB, Presto, \
Spark, Snowflake, and BigQuery. It aims to read a wide variety of SQL inputs and \
output syntactically correct SQL in the targeted dialects. \
 \
It is a very comprehensive generic SQL parser with a robust test suite. It is also \
quite performant while being written purely in Python. You can easily customize the \
parser, analyze queries, traverse expression trees, and programmatically build SQL. \
Syntax errors are highlighted and dialect incompatibilities can warn or raise \
depending on configurations."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-sqlglot-7.0.0-1.3.noarch.rpm"
RPM_HASH = "c976bcf20dc777a223a6916ae8c63fb87b8b30266a65f6275ffad3ed6e1792224e72e8ecbfa73a71a5583bb52fe49ef7098d61ad4136f80f794cdd11df1ff787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sqlglot \
python3.10dist(sqlglot) \
python310-sqlglot \
python3dist(sqlglot)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
