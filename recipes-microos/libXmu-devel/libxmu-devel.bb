SUMMARY = "Development files for the X Miscellaneous Utility Libraries"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets. \
 \
This package contains the development headers for the library found \
in libXmu6 and libXmuu1."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "libXmu-devel-1.1.4-1.2.aarch64.rpm"
RPM_HASH = "c425ae6854d1209c0a61a9e1d526df0b6047172b185731b63db969495e4f0e36bc2a6f5e8f7f0085278b9dd3370b37d7d867b27ca654b2d51c04c47b316f7266"

RPROVIDES:${PN} += "libXmu-devel libXmu-devel(aarch-64) pkgconfig(xmu) pkgconfig(xmuu) xorg-x11-libXmu-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXmu6 libXmuu1 pkgconfig(x11) pkgconfig(xext) pkgconfig(xproto) pkgconfig(xt) xbitmaps-devel"

inherit rpm
