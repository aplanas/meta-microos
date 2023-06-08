SUMMARY = "LXQt Session Manager"
DESCRIPTION = "lxqt-session is the standard session manager used by LXQt. The lxqt-session manager \
is used to automatically start a set of applications and set up a working desktop \
environment. Moreover, the session manager is able to remember the applications in \
use when a user logs out and to restart them the next time the user logs in."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-session-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "340e6ab7a69f7d767d661e09f5019c193c64f331cdecbb858b2f807b669359891ae0da326ba103761e7d60b5703e8dd1162108c5980f03863c280f47276542f5"

RPROVIDES:${PN} += "application() application(lxqt-config-session.desktop) application(lxqt-hibernate.desktop) application(lxqt-leave.desktop) application(lxqt-lockscreen.desktop) application(lxqt-logout.desktop) application(lxqt-reboot.desktop) application(lxqt-shutdown.desktop) application(lxqt-suspend.desktop) config(lxqt-session) lxqt-session lxqt-session(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xdg.so.3()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) liblxqt.so.1()(64bit) libprocps.so.8()(64bit) libprocps.so.8(LIBPROCPS_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) qtxdg-tools update-alternatives"

inherit rpm
