SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavcodec58_134-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "0e00ef4563eac195d2fbb91eb44e062f1788bc1d61f760bc64c5c8f6f2bcdd5b26ddc6bb42676701d3bca5502c72055747e1e2701d06e7ad550ab9088f9424af"

RPROVIDES:${PN} += "libavcodec libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavcodec58_134 libavcodec58_134(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.34)(64bit) libcelt0.so.2()(64bit) libcodec2.so.1.0()(64bit) libdav1d.so.6()(64bit) libgsm.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmp3lame.so.0()(64bit) libopenjp2.so.7()(64bit) libopus.so.0()(64bit) librav1e.so.0()(64bit) libspeex.so.1()(64bit) libswresample.so.3.9()(64bit) libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) libswresample3_9 libtheoradec.so.1()(64bit) libtheoradec.so.1(libtheoradec_1.0)(64bit) libtheoraenc.so.1()(64bit) libtheoraenc.so.1(libtheoraenc_1.0)(64bit) libtwolame.so.0()(64bit) libva.so.2()(64bit) libvorbis.so.0()(64bit) libvorbisenc.so.2()(64bit) libvpx.so.8()(64bit) libwebp.so.7()(64bit) libwebpmux.so.3()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
