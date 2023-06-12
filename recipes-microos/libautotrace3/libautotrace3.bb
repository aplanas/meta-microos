SUMMARY = "Library for converting bitmaps to vector graphics"
DESCRIPTION = "AutoTrace is a program for converting bitmaps to vector graphics. The \
aim of the AutoTrace project is the development of a freely-available \
application similar to CorelTrace or Adobe Streamline. In some aspects, \
it is already better. Originally created as a plug-in for the GIMP, \
AutoTrace is now a stand-alone program and can be compiled on any UNIX \
platform using GCC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.31.1"

RPM_NAME = "libautotrace3-0.31.1-646.3.aarch64.rpm"
RPM_HASH = "6a899c60501257406ba295d36982f5ee0f7f461f99dc8c6955c1ace4f9db64d161dc0ba1d7fe99c6ecc66f1fcb7aacba09824e1d57ad78024cd5b2a0addda058"

RPROVIDES:${PN} += "libautotrace.so.3()(64bit) \
libautotrace3 \
libautotrace3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
