SUMMARY = "Pure Python MySQL Driver"
DESCRIPTION = "This package contains a pure-Python MySQL client library. Documentation on the \
MySQL client/server protocol can be found here: \
http://forge.mysql.com/wiki/MySQL_Internals_ClientServer_Protocol \
 \
The goal of pymysql is to be a drop-in replacement for MySQLdb and work on \
CPython 2.3+, Jython, IronPython, PyPy and Python 3. We test for compatibility \
by simply changing the import statements in the Django MySQL backend and running \
its unit tests as well as running it against the MySQLdb and myconnpy unit tests."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-PyMySQL-1.0.3-1.1.noarch.rpm"
RPM_HASH = "a3748da07bbf1c5a012b31c7da9c2ed82f042a464066767826d3b4c74eec7d99dc97cf4a20bc0c4f6a8fffaecd9aba18c17a8a8e8d1490b58f3164817ea351f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMySQL python3.10dist(pymysql) python310-PyMySQL python3dist(pymysql)"
RDEPENDS:${PN} += "python(abi) python310-cryptography"

inherit rpm
