SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavfilter9-6.0-2.2.aarch64.rpm"
RPM_HASH = "4312f741553aa52e9e8c448843da613eee4b2633660f724b7c7e2c8b43ed17491584b891b4a616d0352886297fdb1cddf9afa25d44b99af3bdaa67bf0ecc10fe"

RPROVIDES:${PN} += "libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavfilter9 \
libavfilter9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libass.so.9()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavcodec60 \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavformat60 \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libavutil58 \
libbs2b.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libfribidi.so.0()(64bit) \
liblilv-0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libmysofa.so.1()(64bit) \
libplacebo.so.264()(64bit) \
libpostproc.so.57()(64bit) \
libpostproc.so.57(LIBPOSTPROC_57.1_SUSE)(64bit) \
libpostproc57 \
librubberband.so.2()(64bit) \
libshaderc_shared.so.1()(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libswresample4 \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libswscale7 \
libva.so.2()(64bit) \
libvidstab.so.1.1()(64bit) \
libvmaf.so.1()(64bit) \
libzimg.so.2()(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
