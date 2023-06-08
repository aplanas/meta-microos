SUMMARY = "MailImporter Akonadi based library for kdepim"
DESCRIPTION = "This package provides the mailimporter library for Akonadi based functions, \
used by KDE PIM applications to import data from other mail formats \
(such as mbox, Maildir...)."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5MailImporterAkonadi5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7dec2aab96f8f135267757566dc6af0f0d4770437c8f5de54ec2c86bfc41fd645473d3d2b71510dddd3cf7819fac371fa04a9b284d597af6b9e3474cd2458a22"

RPROVIDES:${PN} += "libKPim5MailImporterAkonadi.so.5()(64bit) libKPim5MailImporterAkonadi5 libKPim5MailImporterAkonadi5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiMime.so.5()(64bit) libKPim5MailImporter.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) mailimporter"

inherit rpm
