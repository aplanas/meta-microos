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

RPM_NAME = "python39-sqlglot-7.0.0-1.3.noarch.rpm"
RPM_HASH = "ce19ce074a1c65157f55f0205f53f634ac3686c34af94ed62f308784f9b7c3a1c46f874ee29d235193fa6a7ae6765030331d8ed6cb0cf4e4a5e2c5e5de2539a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlglot) python39-sqlglot python3dist(sqlglot)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
