SUMMARY = "Python Interface to the GDBM Library"
DESCRIPTION = "An easy to use interface for Unix DBM databases, and more specifically, \
the GNU implementation GDBM."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-dbm-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "650d021f0da71657ed002b4c47550ac5d5ec1eeda80769008a4a9bc8f74c5bbbd14aafc1a4bf756160891a6f2023e82633e6f4c0c527c5900997cd3f1075380a"

RPROVIDES:${PN} += "python38-dbm python38-dbm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdbm_compat.so.4()(64bit) python(abi) python38"

inherit rpm
