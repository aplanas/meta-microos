SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text. \
 \
This package contains the development files."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "libuchardet-devel-0.0.8-1.3.aarch64.rpm"
RPM_HASH = "684c8331fdee8be42b7d625cbfba76c75830db30645f8fdd2a2fa1aae451b95ee3707fb051de790632425c3ea456d9eeb86febe12a2b71d843e3d69693513f03"

RPROVIDES:${PN} += "cmake(uchardet) \
libuchardet-devel \
libuchardet-devel(aarch-64) \
pkgconfig(uchardet)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuchardet0"

inherit rpm
