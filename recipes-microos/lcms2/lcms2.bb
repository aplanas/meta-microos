SUMMARY = "Little CMS Engine - A color management library and tools"
DESCRIPTION = "Littlecms is a small speed optimized color management engine. \
Little CMS intends to be a small-footprint color management engine \
with a special focus on accuracy and performance. It uses the International \
Color Consortium standard (ICC), which is the modern standard when \
regarding to color management. The ICC specification is widely used and is \
referred to in many International and other de-facto standards."
LICENSE = "MIT"

PV = "2.15"

RPM_NAME = "lcms2-2.15-1.1.aarch64.rpm"
RPM_HASH = "247611c8e9066809a23cba96d1900ce202d237ad25369713cef79f824c21c372162c9564a2727aefcf57ce2dd63898819820fddf6bebe6cc2801f92e1f3b1736"

RPROVIDES:${PN} += "lcms2 lcms2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) liblcms2.so.2()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
