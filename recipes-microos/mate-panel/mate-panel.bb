SUMMARY = "MATE Desktop Panel"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "mate-panel-1.26.2-2.3.aarch64.rpm"
RPM_HASH = "2fa1268c9aecf1488b54120e7b9c5624680309c346b65b18b8b1f0ebf27372eb5f4f7b705aa926a5cf992659b5a01644e9cf73b17fc2b5455d8a7316fe011076"

RPROVIDES:${PN} += "application() application(mate-panel.desktop) mate-panel mate-panel(aarch-64)"
RDEPENDS:${PN} += "gsettings-backend-dconf gvfs-backends ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libICE.so.6()(64bit) libSM.so.6()(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmate-desktop-2.so.17()(64bit) libmate-menu.so.2()(64bit) libmate-panel-applet-4.so.1()(64bit) libmateweather.so.1()(64bit) libpango-1.0.so.0()(64bit) libwnck-3.so.0()(64bit)"

inherit rpm
