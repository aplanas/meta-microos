SUMMARY = "A library for file sharing with WebDAV"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the shared library for phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "libphodav-3_0-0-3.0-1.3.aarch64.rpm"
RPM_HASH = "24679a7fd55227a65b58942cd1259e91c36537b14f1c20580607dd360e1b70d6f934322916369e8f18f267a76dea8c1714b1fbc13834aacc9857c23f0a76c4cc"

RPROVIDES:${PN} += "libphodav-3.0.so.0()(64bit) \
libphodav-3.0.so.0(LIBPHODAV1_0.0)(64bit) \
libphodav-3_0-0 \
libphodav-3_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
