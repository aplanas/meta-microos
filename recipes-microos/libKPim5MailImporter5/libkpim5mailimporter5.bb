SUMMARY = "MailImporter library for kdepim"
DESCRIPTION = "This package provides the mailimporter library, used by KDE PIM applications \
to import data from other mail formats (such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5MailImporter5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "300e68b93f181d913365deccf5fcf9941a82240676576837eadf2e02841cc513743136e3c0755471e2bcbccc92c97f0b6e31af538bfc33673ef7aafcfd5ce1b5"

RPROVIDES:${PN} += "libKPim5MailImporter.so.5()(64bit) libKPim5MailImporter5 libKPim5MailImporter5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) mailimporter"

inherit rpm
