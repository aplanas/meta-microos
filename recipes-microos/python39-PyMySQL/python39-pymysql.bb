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

RPM_NAME = "python39-PyMySQL-1.0.3-1.1.noarch.rpm"
RPM_HASH = "8ad9397b87c362b58977d15e857f9199003e79ddab9658db3efc525f3b5bd38c6900444bd9de2b339fc88a1e6c1f3143f59487a20e32838fd0a451df7c93178b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymysql) python39-PyMySQL python3dist(pymysql)"
RDEPENDS:${PN} += "python(abi) python39-cryptography"

inherit rpm
