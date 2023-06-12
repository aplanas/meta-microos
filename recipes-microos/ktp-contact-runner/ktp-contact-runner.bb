SUMMARY = "Telepathy Krunner plugin"
DESCRIPTION = "A KRunner plugin to find your Telepathy contacts."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-contact-runner-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7aba0142af8281d9024d400123b0acf8ff7e5f1fb12800e03d7f70c9750fb5796024d5b4185bf1c7814f305b6d3832631312eef889b794a2d92105a4bb3719f9"

RPROVIDES:${PN} += "ktp-contact-runner ktp-contact-runner(aarch-64) ktp-contact-runner5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Runner.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libKTpModels.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
