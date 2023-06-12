SUMMARY = "Development headers for libhangul"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhangul."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1~git20180606.42f7640"

RPM_NAME = "libhangul-devel-0.1.1~git20180606.42f7640-1.15.aarch64.rpm"
RPM_HASH = "4d9a294c1519be945ea62d126af965a00e41328333de446be034a6fc4e051b7d4e492fe87709838c31e411c769f2d90d06463183ca300f7bc053a49b1b3cefb5"

RPROVIDES:${PN} += "libhangul-devel \
libhangul-devel(aarch-64) \
pkgconfig(libhangul)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhangul1"

inherit rpm
