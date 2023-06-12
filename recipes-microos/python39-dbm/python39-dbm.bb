SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-dbm-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "ece93869c3bad727b9f08671a4f16aef6b45216896ae13fe9f68d5a1da08a253b0b65e159fe71e8dd70fdf919d8d879889e7d760ae6fba1f45dbf439759c5119"

RPROVIDES:${PN} += "python39-dbm python39-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python39"

inherit rpm
