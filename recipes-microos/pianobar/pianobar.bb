SUMMARY = "Pandora Player"
DESCRIPTION = "pianobar is a console client for the personalized web radio pandora \
 \
- play and manage (create, add more music, delete, rename, ...) your stations \
- rate played songs and let pandora explain why they have been selected \
- show upcoming songs/song history \
- configure keybindings \
- last.fm scrobbling support (external application) \
- proxy support for listeners outside the USA"
LICENSE = "MIT"

PV = "2022.04.01"

RPM_NAME = "pianobar-2022.04.01-1.5.aarch64.rpm"
RPM_HASH = "182a4054bbcdfe799a3c7c3e9a332cb2c91a4508ca5d380771f9773a459a1b343bdff2a28c84820230d83a058cf8848205eb150b7010a4adb2fc0c80c5b1840e"

RPROVIDES:${PN} += "pianobar \
pianobar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libao.so.4()(64bit) \
libao.so.4(LIBAO4_1.1.0)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit)"

inherit rpm
