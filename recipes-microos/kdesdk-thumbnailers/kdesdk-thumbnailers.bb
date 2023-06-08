SUMMARY = "Translation file thumbnail generators"
DESCRIPTION = "This package allows KDE applications to show thumbnails \
and previews of po files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdesdk-thumbnailers-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "53877183d61c98ed6906757f09b22b4d124531390ebcff647df23772de6590b4cf7ed3cdc72d402fe5db2e96d78c51aff82b83c4e7df6694437cd53e5e1a1c98"

RPROVIDES:${PN} += "kdesdk-thumbnailers kdesdk-thumbnailers(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgettextpo.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
