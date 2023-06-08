SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.41.2.0"

RPM_NAME = "python310-apsw-3.41.2.0-1.1.aarch64.rpm"
RPM_HASH = "8670ca74672725cbcac9b8fe391eda642819dce2258084598a26ad92cc2451401ce5aef71f8829a7be95f24440b2f84418bfface72c5ffb7531cf28a4f21456f"

RPROVIDES:${PN} += "python3-apsw python3.10dist(apsw) python310-apsw python310-apsw(aarch-64) python3dist(apsw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) python(abi)"

inherit rpm
