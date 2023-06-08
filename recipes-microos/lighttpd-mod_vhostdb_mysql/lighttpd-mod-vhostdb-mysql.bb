SUMMARY = "MySQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With MySQL based vhosting you can put the information where to look for \
the document-root of a given host into a MySQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_vhostdb_mysql-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "a0a685c0dbbffd21fec261b06adb854ae1db99f3eeeb4501c08c80b3c8e3e399c6d0cc295c09db3801fd48c736115336bb59a88b1e9e3e9b30b3357b92f5c1e3"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_mysql lighttpd-mod_vhostdb_mysql(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) lighttpd"

inherit rpm
