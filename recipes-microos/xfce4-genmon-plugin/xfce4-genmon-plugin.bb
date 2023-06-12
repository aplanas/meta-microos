SUMMARY = "Generic Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Generic Monitor plugin is intended for custom monitoring tasks and \
periodically spawns a given application, captures its output and displays the \
result in form of an image, a bar, a button and a personalized tooltip in the \
panel."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "xfce4-genmon-plugin-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "77ca3cd5a2c21b43c5e7d082b762e5fdc6e4a747dc908a5c2725dd2d95146fa21d7dfb8556267921782cf18246a3d11190d22cf401378bbc7815d3291d1539b7"

RPROVIDES:${PN} += "libgenmon.so()(64bit) \
xfce4-genmon-plugin \
xfce4-genmon-plugin(aarch-64) \
xfce4-panel-plugin-genmon"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-panel"

inherit rpm
