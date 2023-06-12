SUMMARY = "Window matching library"
DESCRIPTION = "bamf matches application windows to desktop files. \
 \
This package contains libraries to be used by applications."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.5.6"

RPM_NAME = "libbamf3-2-0.5.6-1.4.aarch64.rpm"
RPM_HASH = "53608436bbc1268bc4074f9ca7fdb5b862c20b4f1e3989c2fc07dbc5d1a149449da65c7265f7a87f3ce0368589a0f6c18e101f55cd7edf38f05c9bff9c6096f1"

RPROVIDES:${PN} += "libbamf3-2 \
libbamf3-2(aarch-64) \
libbamf3.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
