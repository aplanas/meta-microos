SUMMARY = "Simple interface from Lua to a DBMS"
DESCRIPTION = "A simple interface from Lua to a DBMS. It enables a Lua program to: \
 - Connect to ODBC, ADO, Oracle, MySQL, SQLite and PostgreSQL databases; \
 - Execute arbitrary SQL statements; \
 - Retrieve results in a row-by-row cursor fashion."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "lua54-luasql-2.6.0-1.3.aarch64.rpm"
RPM_HASH = "0bad29749fad0dd5195aadc4a06b2dcda3c82c901916a144265838e0c3dbb80bbbd497bc659c7bdeba9f944674df2083617f8b8df474f7b7a56d1f2499ea5c1f"

RPROVIDES:${PN} += "lua-luasql lua54-luasql lua54-luasql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libiodbc.so.2()(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libmariadb3 libpq.so.5()(64bit) libsqlite3.so.0()(64bit) lua54"

inherit rpm
