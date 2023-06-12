SUMMARY = "MATE Desktop Panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "mate-panel-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "67c932ec7f7ca0576752f81526c6719efdac8a270f40ff13030618b2451c86ab622e08c2e71820dd558b00a434248aed9b177ed8bcd6b2c2dec3c52696fe5ec0"

RPROVIDES:${PN} += "application() \
application(mate-panel.desktop) \
mate-panel \
mate-panel(aarch-64)"
RDEPENDS:${PN} += "gsettings-backend-dconf \
gvfs-backends \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmate-menu.so.2()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libmateweather.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
