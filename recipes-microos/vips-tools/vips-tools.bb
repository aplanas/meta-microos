SUMMARY = "Command line tools for VIPS library"
DESCRIPTION = "This package contains command line tools for processing large images using \
the VIPS library."
LICENSE = "LGPL-2.1-only"

PV = "8.13.3"

RPM_NAME = "vips-tools-8.13.3-1.5.aarch64.rpm"
RPM_HASH = "197811ce510d1fda862b9603a2a78d112dda729928e4b6575cf4d7cacdd118ef03a129bae1a2726378742ddb9483e04aded70b094d494bf1efa0e1f144905214"

RPROVIDES:${PN} += "vips-tools \
vips-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libvips.so.42()(64bit) \
libvips42"

inherit rpm
