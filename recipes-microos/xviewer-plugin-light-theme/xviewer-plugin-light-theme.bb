SUMMARY = "Xviewer light-theme plugin"
DESCRIPTION = "xviewer Light Theme plugin"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xviewer-plugin-light-theme-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "895c39a52da6edf7b9b2ba9a77e547d1429e4c22f742d14086f6de383d449a25081362f743b4b0c3c44edaa7452a2ba4a10fdf026339168d3064c92cc8c7d8f8"

RPROVIDES:${PN} += "liblight-theme.so()(64bit) \
metainfo() \
metainfo(xviewer-light-theme.metainfo.xml) \
xviewer-plugin-light-theme \
xviewer-plugin-light-theme(aarch-64) \
xviewer-plugins:/usr/lib64/xviewer/plugins/light-theme.plugin"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
xviewer-plugins-data"

inherit rpm
