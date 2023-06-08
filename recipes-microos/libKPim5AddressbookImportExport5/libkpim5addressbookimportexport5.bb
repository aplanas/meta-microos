SUMMARY = "Library which provides import/export functionality for KAddressbook"
DESCRIPTION = "This library provides an interface to implement import/export plugins for KAddressbook."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AddressbookImportExport5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "cd327caae8babf1a354d7bbc12c6c7f1c17f64d94c8c1415a713c90819eb98ff99d2395c9020a6e3a03f98a4cd6144eea81774bf71a70be8c682d822da548d23"

RPROVIDES:${PN} += "libKPim5AddressbookImportExport.so.5()(64bit) libKPim5AddressbookImportExport5 libKPim5AddressbookImportExport5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
