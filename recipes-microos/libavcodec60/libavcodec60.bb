SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavcodec60-6.0-2.1.aarch64.rpm"
RPM_HASH = "2d41bee3324031ef33d98900a21429c5346acf6283ab06234c40d7ff193db33acc340666d05f1d620e9247da0cc184dfc4a54f93e4f95f40c71a9d77caf24d32"

RPROVIDES:${PN} += "libavcodec libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavcodec60 libavcodec60(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.34)(64bit) libcodec2.so.1.0()(64bit) libdav1d.so.6()(64bit) libgsm.so.1()(64bit) libjxl.so.0.8()(64bit) libjxl.so.0.8(JXL_0)(64bit) libjxl_threads.so.0.8()(64bit) libjxl_threads.so.0.8(JXL_0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmp3lame.so.0()(64bit) libopenjp2.so.7()(64bit) libopus.so.0()(64bit) librav1e.so.0()(64bit) libspeex.so.1()(64bit) libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswresample4 libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libtheoraenc.so.1()(64bit) libtheoraenc.so.1(libtheoraenc_1.0)(64bit) libtwolame.so.0()(64bit) libva.so.2()(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit) libvpx.so.8()(64bit) libwebp.so.7()(64bit) libwebpmux.so.3()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
