SUMMARY = "GTK+ 2 UI backend for Gwenhywfar"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication). \
 \
This package provides the GTK+ 2 implementation of the generic UI toolkit."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwengui-gtk2-79-5.10.1-1.4.aarch64.rpm"
RPM_HASH = "afe2f7d214b0e345291bea0b51dd69c44c3a83450e17232b947618e8403a44519516e418a83f42a40216bedfd36cf489d9182f99e5fcb4e87a857afa3c3c4c3a"

RPROVIDES:${PN} += "libgwengui-gtk2-79 \
libgwengui-gtk2-79(aarch-64) \
libgwengui-gtk2.so.79()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libgwenhywfar.so.79()(64bit)"

inherit rpm
