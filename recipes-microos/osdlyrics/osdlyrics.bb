SUMMARY = "A third-party lyrics display program"
DESCRIPTION = "OSD Lyrics is a lyrics show compatible with various media players. It is not a \
plugin but a standalone program. OSD Lyrics shows lyrics on your desktop, in the \
style similar to KaraOK. It also provides another displaying style, in which \
lyrics scroll from bottom to top. OSD Lyrics can download lyrics from the \
network automatically."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "osdlyrics-0.5.13-1.3.aarch64.rpm"
RPM_HASH = "295305fe7df568320c9e63af27055f99edb7d8ac5401756794c9226772cb27e576656fcdc0565779edff5b626fbc858b601da866ccd38cb2408fe87180415090"

RPROVIDES:${PN} += "application() \
application(osdlyrics.desktop) \
metainfo() \
metainfo(osdlyrics.appdata.xml) \
osdlyrics \
osdlyrics(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gtk2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libappindicator.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
python3-chardet \
python3-future \
python3-pycurl \
sqlite3"

inherit rpm
