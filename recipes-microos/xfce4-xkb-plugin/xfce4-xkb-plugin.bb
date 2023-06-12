SUMMARY = "XKB Layout Switcher Plugin for the Xfce Panel"
DESCRIPTION = "The XKB plugin allows to setup and switch between multiple XKB keyboard \
layouts."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.3"

RPM_NAME = "xfce4-xkb-plugin-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "f568d26bd93d6a000898b3d4d6c394529e4adc06bbeca8580454a633f0f94557c8569c95c41962710c0e44d3239e77d51fb0e00732694a70949ae19df3fd7226"

RPROVIDES:${PN} += "libxkb.so()(64bit) \
xfce4-panel-plugin-xkb \
xfce4-xkb-plugin \
xfce4-xkb-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgarcon-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
librsvg-2.so.2()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
libxklavier.so.16()(64bit) \
xfce4-panel \
xfce4-settings"

inherit rpm
