SUMMARY = "Development files and documentation for GTS"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that use GTS."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-devel-0.7.6_p20121130-4.29.aarch64.rpm"
RPM_HASH = "11795f03f53e6e8bed48c89186a070583f982e6f905772c32eb19f62e8da9caa79d11d184deec19f2629da75dd2326470fcbddc4d550ab99c793f0ecc0e36efe"

RPROVIDES:${PN} += "gts-devel \
gts-devel(aarch-64) \
pkgconfig(gts)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc \
gcc-c++ \
glib2-devel \
gts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgts-0.7.so.5()(64bit) \
libgts-0_7-5 \
libnetpbm.so.11()(64bit) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gthread-2.0)"

inherit rpm
