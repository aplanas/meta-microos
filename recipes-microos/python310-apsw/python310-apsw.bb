SUMMARY = "Another Python SQLite Wrapper"
DESCRIPTION = "APSW is a Python wrapper for the SQLite embedded relational database \
engine. In contrast to other wrappers such as pysqlite it focuses on \
being a minimal layer over SQLite attempting just to translate the \
complete SQLite API into Python."
LICENSE = "Zlib"

PV = "3.42.0.0"

RPM_NAME = "python310-apsw-3.42.0.0-1.1.aarch64.rpm"
RPM_HASH = "ba72c91b61bbf0d4917096a40da7343c2c7f29e1ce572370ebc21e32869540299d53e4331b11e2d11f786c121cad4f6f1e518203a2ebd42ad4bb1f44200885c5"

RPROVIDES:${PN} += "python3-apsw python3.10dist(apsw) python310-apsw python310-apsw(aarch-64) python3dist(apsw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit) python(abi)"

inherit rpm
