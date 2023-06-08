SUMMARY = "Power Management for the Xfce Desktop Environment"
DESCRIPTION = "The Xfce Power Manager is a tool for the Xfce desktop environment for managing \
profiles of policies which affect power consumption, such as the display \
brightness level, display sleep times, or CPU frequency scaling. It can also \
trigger actions on certain events such as closing the lid or reaching low \
battery levels and provides a set of interfaces to inform other applications \
about current power level so that they can adjust their power consumption. \
Furthermore, it provides a standardized inhibit interface which allows \
applications to prevent automatic sleep actions via the power manager."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfce4-power-manager-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "4cd594c11c8d01154094d66be3d1512f0e94c59d6261046e19272dcd451b498602c0ae3e9f8473bedf62bb997f1519a521e8ca36548f0d77e273d9bdaa7a03ff"

RPROVIDES:${PN} += "application() application(xfce4-power-manager-settings.desktop) config(xfce4-power-manager) metainfo() metainfo(xfce4-power-manager.appdata.xml) xfce4-power-manager xfce4-power-manager(aarch-64) xfce4-power-manager-doc"
RDEPENDS:${PN} += "/usr/bin/pkexec ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libupower-glib.so.3()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) libxfconf-0.so.3()(64bit) systemd upower"

inherit rpm
