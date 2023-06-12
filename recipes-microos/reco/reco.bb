SUMMARY = "Audio Recording App"
DESCRIPTION = "An audio recording app designed for elementary OS."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "reco-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "e543e5394b903aaf910e64265add1fb77f4fec1ad68c2a50de533b16e1c8b2b373059ca521e08097aa9f9790bafa313e90521d2fec63f1d4d321684ffcf8eafa"

RPROVIDES:${PN} += "application() \
application(com.github.ryonakano.reco.desktop) \
metainfo() \
metainfo(com.github.ryonakano.reco.appdata.xml) \
reco \
reco(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
