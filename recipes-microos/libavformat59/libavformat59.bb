SUMMARY = "FFmpeg's stream format library"
DESCRIPTION = "The libavformat library provides a generic framework for multiplexing \
and demultiplexing (muxing and demuxing) audio, video and subtitle \
streams. It encompasses multiple muxers and demuxers for multimedia \
container formats. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavformat59-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "fa58a22f731183bc8ff6c181adad16abc179fe6f7fee54ecfff013c0db07000e2ea047d357c7bd40f60f9276ab5e9e25eba1eb392809e675ea31de9b8b8cc9a5"

RPROVIDES:${PN} += "libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavformat59 libavformat59(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavcodec59 libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libbluray.so.2()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libopenmpt.so.0()(64bit) librist.so.4()(64bit) libsrt.so.1.5()(64bit) libssh.so.4()(64bit) libssh.so.4(LIBSSH_4_5_0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0.2)(64bit) libzmq.so.5()(64bit)"

inherit rpm
