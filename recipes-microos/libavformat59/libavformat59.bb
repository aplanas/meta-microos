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

RPM_NAME = "libavformat59-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "a38ffd250a05f178ba54aeef1cd42223839c3477507ed6e9e4c720b36fb413c030ec7e94a3fd9e2c9d7edfe47db3b6e90adc5fae6b859822f2679bbf40914395"

RPROVIDES:${PN} += "libavformat.so.59()(64bit) \
libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) \
libavformat59 \
libavformat59(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.59()(64bit) \
libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) \
libavcodec59 \
libavutil.so.57()(64bit) \
libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) \
libavutil57 \
libbluray.so.2()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libopenmpt.so.0()(64bit) \
librist.so.4()(64bit) \
libsrt.so.1.5()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0.2)(64bit) \
libzmq.so.5()(64bit)"

inherit rpm
