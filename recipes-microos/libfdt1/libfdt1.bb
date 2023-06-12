SUMMARY = "Device tree library"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libfdt1-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "a51e809f0b33ba867c0a920948d00876d29518c363e0a751b5a049e7103e6a406d507d7ecae1a725ed9e710c47dc19dd6c2094bbf5bf25f08cb19dc19b53c1ad"

RPROVIDES:${PN} += "libfdt.so.1()(64bit) \
libfdt.so.1(LIBFDT_1.2)(64bit) \
libfdt1 \
libfdt1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
