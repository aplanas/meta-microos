SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-desktop-emojier-5.27.4-2.1.aarch64.rpm"
RPM_HASH = "d7ebc1804502bd533452f802b0bbb8733a5f263599bd6e0b28b4dbc7196f50a1e62d191f327bbe3f6bc07adbf202153cf65ecea42e121948305ea536bc17c700"

RPROVIDES:${PN} += "application() application(org.kde.plasma.emojier.desktop) plasma5-desktop-emojier plasma5-desktop-emojier(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) plasma5-desktop"

inherit rpm
