SUMMARY = "Tools for wcslib"
DESCRIPTION = "This package contains tools for working with files created or \
opened with wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-tools-7.12-1.6.aarch64.rpm"
RPM_HASH = "ccea4b73dd353ee5311c10d67c74861c5faf9b40d95a461e84d9e7039d4f673e0773a8d449cd507a85406f66942fe205c46e512e23c333ae4b64386c8c6a66f6"

RPROVIDES:${PN} += "libwcs-tools \
wcslib-tools \
wcslib-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcfitsio.so.10()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libwcs7"

inherit rpm
