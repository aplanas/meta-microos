SUMMARY = "GMenu to DBusMenu Proxy"
DESCRIPTION = "This package provides a proxy translating GMenu (GTK Menu) to DBusMenu (the \
standard), useful for global menu implementations."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4.1"

RPM_NAME = "gmenudbusmenuproxy-5.27.4.1-2.2.aarch64.rpm"
RPM_HASH = "b992dbdf5dcd89940f216c00039929600f223357966c3d866cd15d0bbd8af3acd126aaf7734cf00a5d9b93538a07185404d3ea01a963f81c95452e49defb7a1b"

RPROVIDES:${PN} += "gmenudbusmenuproxy gmenudbusmenuproxy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libxcb.so.1()(64bit)"

inherit rpm
