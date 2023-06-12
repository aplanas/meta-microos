SUMMARY = "Library for Reading and Writing Quicktime Movie Files"
DESCRIPTION = "A library for reading and writing Quicktime movie files, based on and \
forked from quicktime4linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "661de4ee0967a71e8d6c75bef878cc4ca4b105f39e77ed4417a32addf758117a178b151b8afb4f7bd809bb83b82072212736536c7d7a19b497c2e9208427c2a6"

RPROVIDES:${PN} += "libquicktime \
libquicktime(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdv.so.4()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmp3lame.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libquicktime.so.0()(64bit) \
libschroedinger-1.0.so.0()(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm
