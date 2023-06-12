SUMMARY = "Python-PostgreSQL Database Adapter"
DESCRIPTION = "psycopg2 is a PostgreSQL database adapter for the Python programming \
language. \
 \
psycopg2 is different from the other database adapter because it was \
designed for heavily multi-threaded applications that create and destroy \
lots of cursors and make a conspicuous number of concurrent INSERTs or \
UPDATEs. psycopg2 also provide asychronous operations and support \
for coroutine libraries."
LICENSE = "LGPL-3.0-or-later & (LGPL-3.0-or-later | ZPL-2.0) & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.9.6"

RPM_NAME = "python39-psycopg2-2.9.6-2.1.aarch64.rpm"
RPM_HASH = "8a80905b5f16c878aff6ae549278e4a589e3b408c35d4eb74722f2d24a068d3e4b92ad24f416d56bdc140c3efde11da198bb180aa2990c33243dd51f427b52f0"

RPROVIDES:${PN} += "python3.9dist(psycopg2) \
python39-psycopg2 \
python39-psycopg2(aarch-64) \
python3dist(psycopg2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
python(abi)"

inherit rpm
