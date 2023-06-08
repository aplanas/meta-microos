SUMMARY = "Development package for mailcommon"
DESCRIPTION = "This package contains the development headers for the mailcommon library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mailcommon-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "877ef254948e072d45ab75c1b00fb517e9f1d27e7bf2ac2bdda90f02c5f4894ef867a77740491cd37683432e9e7ee286067d88e7f48200d24bca811a7f55770a"

RPROVIDES:${PN} += "cmake(KF5MailCommon) cmake(KPim5MailCommon) mailcommon-devel mailcommon-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Completion) cmake(KF5PimCommon) cmake(KPim5Akonadi) cmake(KPim5AkonadiMime) cmake(KPim5Libkdepim) cmake(KPim5MessageCore) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5MailCommon.so.5()(64bit) libKPim5MailCommon5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
