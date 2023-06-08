SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5Runner5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "112e8a364594aacc05cfe0772a8aa5e66a37aa5efd6442339560a821f14fdb35a6afaf83a6a51afe4e98cbff6b5fdbae99ab9df9e58bbb1231eac3eaa8929a99"

RPROVIDES:${PN} += "libKF5Runner.so.5()(64bit) libKF5Runner5 libKF5Runner5(aarch-64) librunnermodelplugin.so()(64bit) qt5qmlimport(org.kde.runnermodel.2)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Plasma.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5ThreadWeaver.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
