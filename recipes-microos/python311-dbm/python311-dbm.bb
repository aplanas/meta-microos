SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "python311-dbm-3.11.3-1.1.aarch64.rpm"
RPM_HASH = "19137471384d865fd696ce2f85651163dc8bc51d3cd494f00cb1d930f829c410928f92bf4553f34466035727516185c0cf09dd75a1f21f2c32229026c2dbedea"

RPROVIDES:${PN} += "python311-dbm python311-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python311"

inherit rpm
