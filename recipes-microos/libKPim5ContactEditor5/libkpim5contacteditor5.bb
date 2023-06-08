SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5ContactEditor5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8f037a4afd6f36132b7da11724c8861c1ee6cc9896a6492977276565a3ecf0488f85cfc1a53dfb8c51ae671a1bcc7e6e79c9f9c2d42d8625ac5ec92c5ecd25e8"

RPROVIDES:${PN} += "libKPim5ContactEditor.so.5()(64bit) libKPim5ContactEditor5 libKPim5ContactEditor5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig akonadi-contact ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
