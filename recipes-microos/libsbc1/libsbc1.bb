SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Library"
DESCRIPTION = "The package contains libraries for using the SBC codec."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "libsbc1-1.5-2.11.aarch64.rpm"
RPM_HASH = "d471d4974406bbec7b98c24f90aaa32a067b8275bac61bd57ac0fedae33986df28287708bc36aeedea3b5c8d125716618bb246a10002d635acfcdbeffa53eef0"

RPROVIDES:${PN} += "libsbc.so.1()(64bit) \
libsbc.so.1(SBC_1.0)(64bit) \
libsbc.so.1(SBC_1.1)(64bit) \
libsbc.so.1(SBC_1.2)(64bit) \
libsbc.so.1(SBC_1.3)(64bit) \
libsbc1 \
libsbc1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
