SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailImporterAkonadi5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "09e98d799326fea087323dc6672b00d7d7cadfd819af44be82263509f7871336969f28edf7eb4d80a9eb489d469e7899b5ae8aebf89569deff15189e7fcc2ddd"

RPROVIDES:${PN} += "libKPim5MailImporterAkonadi.so.5()(64bit) libKPim5MailImporterAkonadi5 libKPim5MailImporterAkonadi5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5MailImporter.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) mailimporter"

inherit rpm
