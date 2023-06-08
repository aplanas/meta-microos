SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "This package contains the shared libraries used to provide the mail import \
wizard functionality to KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5ImportWizard5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "5ce829a4bf6be5cb2f4e5a8602c6eb1a923171103d2899c2e360923ad947d3dc7c019c6d567ead210f4bf5cb79d5b8dbd3710cd7231b1730560d2fb12ad9be4a"

RPROVIDES:${PN} += "libKPim5ImportWizard.so.5()(64bit) libKPim5ImportWizard5 libKPim5ImportWizard5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommonAkonadi.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5MailCommon.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqt5keychain.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
