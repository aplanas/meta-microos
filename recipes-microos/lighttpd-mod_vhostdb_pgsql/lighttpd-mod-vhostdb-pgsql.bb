SUMMARY = "PostgreSQL based virtual hosts module for Lighttpd"
DESCRIPTION = "With PostgreSQL based vhosting you can put the information where to look \
for the document-root of a given host into a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_vhostdb_pgsql-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "e12b64faa4a9ea112e4922d70483964e8b253a06de26524bf01327d45f462bc6c1007860c7d8df527df609b893da9f07b23f14d6c02aa7821fcd5c75b590e39c"

RPROVIDES:${PN} += "lighttpd-mod_vhostdb_pgsql lighttpd-mod_vhostdb_pgsql(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) lighttpd"

inherit rpm
