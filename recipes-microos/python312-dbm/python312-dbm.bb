SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-dbm-3.12.0a7-1.1.aarch64.rpm"
RPM_HASH = "d0550e8244ff20a66d51c8990021217d8624fd3e0d69c0e11b47a3b48a27275695a0df67332dc7fffbf929d5c2505c122f33a98b96dcfd5c18bdf0cae20c2d10"

RPROVIDES:${PN} += "python312-dbm python312-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python312"

inherit rpm
