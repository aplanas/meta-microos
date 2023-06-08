SUMMARY = "Xfce Panel Plugin for Monitoring Batteries and Changing the Display Brightness"
DESCRIPTION = "This package provides a plugin for the Xfce panel for monitoring battery and \
device charge levels and to regulate display brightness."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfce4-power-manager-plugin-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "e652d9c7639c6246328b59664bd2a249c1850210a20ad2e9308115f48e50222fe61b4b15f941927dab043b44c78dc2d6083159bf909e72c7de392bc932ad5761"

RPROVIDES:${PN} += "libxfce4powermanager.so()(64bit) xfce4-panel-plugin-brightness xfce4-panel-plugin-power-manager xfce4-panel-plugin-xfce4battery xfce4-power-manager-plugin xfce4-power-manager-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libupower-glib.so.3()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) xfce4-panel xfce4-power-manager"

inherit rpm
