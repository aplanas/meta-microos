SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.41.2.0"

RPM_NAME = "python311-apsw-3.41.2.0-1.1.aarch64.rpm"
RPM_HASH = "e25c625aa8bd46d6ffb0be1f44e68043667c97950b697c13934e6d6a7ad81f5194022b82a2eb8e61b73416a0d04c5f7118fcaa2d2a1f0744d71d1e163c9c4e4f"

RPROVIDES:${PN} += "python3.11dist(apsw) python311-apsw python311-apsw(aarch-64) python3dist(apsw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) python(abi)"

inherit rpm
