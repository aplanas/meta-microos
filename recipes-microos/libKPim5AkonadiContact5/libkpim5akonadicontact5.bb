SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AkonadiContact5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b2653011740238011164d866a669263266f8c6f520163bd9e8fadd660a913b4501d8ad54ceb89cbd15c1761a0a890333df4a48d925a295df6b400c674c2385b0"

RPROVIDES:${PN} += "libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiContact5 libKPim5AkonadiContact5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig akonadi-contact ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGrantlee_Templates.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5I18nLocaleData.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Prison.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5ContactEditor.so.5()(64bit) libKPim5GrantleeTheme.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
