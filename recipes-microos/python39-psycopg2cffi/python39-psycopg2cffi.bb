SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python39-psycopg2cffi-2.9.0-2.5.aarch64.rpm"
RPM_HASH = "cccded2ac678254ef18f4368beee9f6ec9c78fb86fa94f22078f7298d16ce3b0fd5c6e0d81ee3fced896ed7420e1c33c2711629b364c2424861d08e45d6aa532"

RPROVIDES:${PN} += "python3.9dist(psycopg2cffi) python39-psycopg2cffi python39-psycopg2cffi(aarch-64) python3dist(psycopg2cffi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) python(abi) python39-cffi python39-six"

inherit rpm
