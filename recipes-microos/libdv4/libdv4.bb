SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv4-1.0.0-179.5.aarch64.rpm"
RPM_HASH = "ad9630adba3d80bf105dbf98682f9356f5ac951403cf7110d7aed02546bf2604e0002bb2999c88dd4eb1adfde0e97b2d47e324e13d030c1c24bd8d27c23f144a"

RPROVIDES:${PN} += "libdv.so.4()(64bit) \
libdv4 \
libdv4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
