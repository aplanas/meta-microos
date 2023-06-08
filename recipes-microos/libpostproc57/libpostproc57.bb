SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libpostproc57-6.0-2.1.aarch64.rpm"
RPM_HASH = "a373ad7527ac4d4a156f4ac4f2de088ade1611d742e87747f358693366dc418cd6240f2da928d03dcd183cf6ee76167f26fe2820da3fa5acb0058cbc0b37bb69"

RPROVIDES:${PN} += "libpostproc.so.57()(64bit) libpostproc.so.57(LIBPOSTPROC_57.1_SUSE)(64bit) libpostproc57 libpostproc57(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
