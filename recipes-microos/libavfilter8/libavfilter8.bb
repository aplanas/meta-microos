SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavfilter8-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "3d558148c9b12ee4ced8f6b067ebd56c7d488b3229f2ad4e7fe27b78783f125651d074d0fc585ad1cee89178579eef5baee7d1e461a831172239b5caaff62133"

RPROVIDES:${PN} += "libavfilter.so.8()(64bit) libavfilter.so.8(LIBAVFILTER_8.44_SUSE)(64bit) libavfilter8 libavfilter8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libass.so.9()(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavcodec59 libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavformat59 libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libbs2b.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libfribidi.so.0()(64bit) liblilv-0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmysofa.so.1()(64bit) libpostproc.so.56()(64bit) libpostproc.so.56(LIBPOSTPROC_56.6_SUSE)(64bit) libpostproc56 librubberband.so.2()(64bit) libshaderc_shared.so.1()(64bit) libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) libswresample4_ff5 libswscale.so.6()(64bit) libswscale.so.6(LIBSWSCALE_6.7_SUSE)(64bit) libswscale6 libva.so.2()(64bit) libvidstab.so.1.1()(64bit) libvmaf.so.1()(64bit) libzimg.so.2()(64bit) libzmq.so.5()(64bit)"

inherit rpm
