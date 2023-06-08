SUMMARY = "Telepathy filetransfer handler"
DESCRIPTION = "Telepathy text filetransfer handler"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ktp-filetransfer-handler-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "127afc99648ba1a624e9d39cd76893a94c40ec294eab484e5bae2cefa30ca1fda713aa308945d42a00cc261af05475ffc5be789f4ade32270c5539147bb01dd5"

RPROVIDES:${PN} += "ktp-filetransfer-handler ktp-filetransfer-handler(aarch-64) ktp-filetransfer-handler5"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKTpCommonInternals.so.9()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libtelepathy-qt5.so.0()(64bit)"

inherit rpm
