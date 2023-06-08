SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavcodec59-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "3c0fa8e8a39dd0f68e250bab351badf6191c28dfad006b8aeed628f31192a6784ae16858aea229855d47c7cc01f37c0a9d81b70aee699fff474b94510b50a96b"

RPROVIDES:${PN} += "libavcodec libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavcodec59 libavcodec59(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.34)(64bit) libcodec2.so.1.0()(64bit) libdav1d.so.6()(64bit) libgsm.so.1()(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmp3lame.so.0()(64bit) libopenjp2.so.7()(64bit) libopus.so.0()(64bit) librav1e.so.0()(64bit) libspeex.so.1()(64bit) libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) libswresample4_ff5 libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libtheoraenc.so.1()(64bit) libtheoraenc.so.1(libtheoraenc_1.0)(64bit) libtwolame.so.0()(64bit) libva.so.2()(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit) libvpx.so.8()(64bit) libwebp.so.7()(64bit) libwebpmux.so.3()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
