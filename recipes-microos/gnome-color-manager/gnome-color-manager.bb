SUMMARY = "Color management tools for GNOME"
DESCRIPTION = "GNOME Color Manager is a session framework that makes it easy to manage, \
install and generate color profiles in the GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.36.0"

RPM_NAME = "gnome-color-manager-3.36.0-2.9.aarch64.rpm"
RPM_HASH = "65cc005bbf87d6681e6f956f9e6808fefcf0a8fe2226783e141d74c6acf87be38a317e46284cd53e772161794fd12036be46a9b6c3900c38216d3b9886587965"

RPROVIDES:${PN} += "application() \
application(gcm-import.desktop) \
application(gcm-picker.desktop) \
application(org.gnome.ColorProfileViewer.desktop) \
gnome-color-manager \
gnome-color-manager(aarch-64) \
metainfo() \
metainfo(org.gnome.ColorProfileViewer.appdata.xml) \
mimehandler(application/vnd.iccprofile)"
RDEPENDS:${PN} += "colord \
colord-color-profiles \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcolord.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
