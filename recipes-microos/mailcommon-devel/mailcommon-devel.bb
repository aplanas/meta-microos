SUMMARY = "Development package for mailcommon"
DESCRIPTION = "This package contains the development headers for the mailcommon library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "mailcommon-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b9f2e7aeb7f4872dc76d5b3f1e57f8d92b49514a59982d997fa4fb4762c1736257154fbd5b5f8051b16e6807736e1dc1dee659d04b02054e347ec7be17d04e43"

RPROVIDES:${PN} += "cmake(KF5MailCommon) \
cmake(KPim5MailCommon) \
mailcommon-devel \
mailcommon-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Completion) \
cmake(KF5PimCommon) \
cmake(KPim5Akonadi) \
cmake(KPim5AkonadiMime) \
cmake(KPim5Libkdepim) \
cmake(KPim5MessageCore) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5MailCommon5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
