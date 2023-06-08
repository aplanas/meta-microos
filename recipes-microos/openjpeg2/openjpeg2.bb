SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the codec executables."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-2.5.0-3.3.aarch64.rpm"
RPM_HASH = "84132a4c4a5c9ca40a0a77dcd7b2c1d45ae15c0a3405934f92ef846aed92f03a6a8cb4b499f22b68dfbb81face8a5e26ef9100274d801f5a6cee40fb2c28e4cd"

RPROVIDES:${PN} += "openjpeg2 openjpeg2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblcms2.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenjp2.so.7()(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
