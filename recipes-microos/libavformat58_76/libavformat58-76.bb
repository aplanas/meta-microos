SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavformat58_76-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "d19c9eb1b027dc8a54e5c56b6a66890716dd0232e3e88d8d8a35a1a7c08772745bfa477bf5666d20093fa07d59e53505b99990378a4e1309c4e9f085040df004"

RPROVIDES:${PN} += "libavformat.so.58.76()(64bit) libavformat.so.58.76(LIBAVFORMAT_58)(64bit) libavformat58_76 libavformat58_76(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavcodec58_134 libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libbluray.so.2()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenmpt.so.0()(64bit) libsrt.so.1.5()(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libzmq.so.5()(64bit)"

inherit rpm
