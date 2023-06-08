SUMMARY = "Widgets for configuration dialogs: Build Environment"
DESCRIPTION = "KConfigWidgets provides easy-to-use classes to create configuration dialogs, as \
well as a set of widgets which uses KConfig to store their settings. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kconfigwidgets-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "120b79e09a99f77944131cc172ec6d6146abdf6016b4891dc695ca66d02cc2fecb2b639e9669ac71f761be1e593b3725eda6057dc4befb55911be97e64cd7c85"

RPROVIDES:${PN} += "cmake(KF5ConfigWidgets) kconfigwidgets-devel kconfigwidgets-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl cmake(KF5Auth) cmake(KF5Codecs) cmake(KF5Config) cmake(KF5WidgetsAddons) extra-cmake-modules ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5ConfigWidgets5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
