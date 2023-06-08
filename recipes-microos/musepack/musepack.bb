SUMMARY = "Audio Compression Format"
DESCRIPTION = "Musepack is an audio compression format with an emphasis on audio \
quality. It is not lossless, but it is designed for transparency, so \
that differences between the original wave file and the much smaller \
MPC file are indiscernible (given enough of a bitrate, as usual). \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but has further \
been developed."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-r475-4.11.aarch64.rpm"
RPM_HASH = "c55dd6f6310dc1606285bd492505d98f6717e7a957f9825ebcb6a154144852267466faccbddab8bbaf890116c7c6b44d85e0ab05ee75cbe5f83e0275b3b2da16"

RPROVIDES:${PN} += "musepack musepack(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcuefile.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpcdec.so.6()(64bit) libreplaygain.so.1()(64bit)"

inherit rpm
