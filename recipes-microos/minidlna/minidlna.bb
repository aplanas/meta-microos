SUMMARY = "DLNA compatible server"
DESCRIPTION = "MiniDLNA (aka ReadyDLNA) is server software with the aim of being fully \
compliant with DLNA/UPnP-AV clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "minidlna-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "f069dce9a176262b1fe16183499290fb2a0e505d12d55a8e9908efe3544fced11e5ce3a2953bd36bd8d839470ef061004e3f0923f384f091fd162b8c4d2cc323"

RPROVIDES:${PN} += "ReadyMedia \
config(minidlna) \
group(minidlna) \
minidlna \
minidlna(aarch-64) \
user(minidlna)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC.so.12()(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexif.so.12()(64bit) \
libid3tag.so.0.16.2()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libogg.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libvorbis.so.0()(64bit) \
sysuser-shadow"

inherit rpm
