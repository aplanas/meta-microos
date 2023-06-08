SUMMARY = "KDE's screen management library"
DESCRIPTION = "Plugins for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libkscreen2-plugin-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "22896d1450f888b63a9a6a4d2718fdce303ccb754af2f54a69fea700076b9b67b4576b65bb23d1e8c31135c174592303824872169f0c78f123bd34c7ccd31b5b"

RPROVIDES:${PN} += "libkscreen2-plugin libkscreen2-plugin(aarch-64) libkscreen2-zsh-completion"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5Screen.so.8()(64bit) libKF5Screen8 libKF5ScreenDpms.so.8()(64bit) libKF5ScreenDpms8 libKF5WaylandClient.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwayland-client.so.0()(64bit) libxcb-randr.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
