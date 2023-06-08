SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.41.2.0"

RPM_NAME = "python39-apsw-3.41.2.0-1.1.aarch64.rpm"
RPM_HASH = "051a8c6be041e2799590d0c3dd9fb6ee996c7ccb6d2de847ba7c4067cd044cb307a7f70a6a30b35cb6223d642f43e299871b1a1bf95c855b1800c1fce8572fb6"

RPROVIDES:${PN} += "python3.9dist(apsw) python39-apsw python39-apsw(aarch-64) python3dist(apsw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) python(abi)"

inherit rpm
