SUMMARY = "MIME email parser for KDE PIM - core library"
DESCRIPTION = "This package contains the core libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AkonadiMime5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bdc26aa48bf2b889473be2fa6914de526ac4450511213424cd005fb881af2a1cc23eb99d7aa5f6d2cbfc94c1f9d16e5ca59a3360837e6c31bced40b6231f40be"

RPROVIDES:${PN} += "libKPim5AkonadiMime.so.5()(64bit) libKPim5AkonadiMime5 libKPim5AkonadiMime5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
