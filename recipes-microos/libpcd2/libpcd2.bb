SUMMARY = "Library For Reading PhotoCD Images"
DESCRIPTION = "Libraries for reading PhotoCD images."
LICENSE = "GPL-2.0+"

PV = "1.0.1"

RPM_NAME = "libpcd2-1.0.1-9.28.aarch64.rpm"
RPM_HASH = "8bd0465d459a7651bbc8fb1ee11ae28dd240e3efc14154ce57604e75fda27cee0ab96d49f37fecf50eee010366a0011667cb72d02d22ec75aa4335b37034d825"

RPROVIDES:${PN} += "libpcd.so.2()(64bit) libpcd2 libpcd2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
