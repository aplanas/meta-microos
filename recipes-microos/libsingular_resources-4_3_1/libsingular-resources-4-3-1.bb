SUMMARY = "Singular's 'Singular' library"
DESCRIPTION = "(Upstream has not provided any description.)"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libsingular_resources-4_3_1-4.3.1.p3-1.3.aarch64.rpm"
RPM_HASH = "984abd5fe1ced905af2e28ae582b26ae7e52999cd40a7910c39adf735aa820a1066f60f5aa1b4373e09e0a10a5b847bfd2bd6145b841e1460df3f5f682df1204"

RPROVIDES:${PN} += "libsingular_resources-4.3.1.p3.so()(64bit) \
libsingular_resources-4_3_1 \
libsingular_resources-4_3_1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
