SUMMARY = "GNOME shell like dashboard for Xfce"
DESCRIPTION = "Xfdashboard provides a GNOME shell dashboard like interface for use with Xfce \
desktop. It can be configured to run to any keyboard shortcut and when executed \
provides an overview of applications currently open enabling the user to switch \
between different applications. The search feature works like Xfce's app finder \
which makes it convenient to search for and start applications."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "b51c93da63c2cd9b154f93e1377f5ef0395db3f6a383bf6da3bf36f0d785954b1499ede9739e74e04139c803a38facb41c358bd576e467c0faf6319fd203dd1a"

RPROVIDES:${PN} += "application() \
application(org.xfce.xfdashboard-settings.desktop) \
application(org.xfce.xfdashboard.desktop) \
metainfo() \
metainfo(org.xfce.xfdashboard.metainfo.xml) \
xfdashboard \
xfdashboard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk-module-common \
libclutter-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
libxfdashboard.so.0()(64bit)"

inherit rpm
