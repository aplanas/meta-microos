SUMMARY = "User tools for libqtxg"
DESCRIPTION = "User tools for libqtxdg. \
qtxdg-tools contains a CLI MIME tool, qtxdg-mat, for handling file associations and opening files with their default applications. \
It is maintained by the LXQt project and needed by LXQt Session, in order to be used by xdg-utils. Yet it can be used independently from LXQt, too."
LICENSE = "LGPL-2.1-or-later"

PV = "3.11.0"

RPM_NAME = "qtxdg-tools-3.11.0-1.1.aarch64.rpm"
RPM_HASH = "00bef36738f7ce6e8cdacac675c9a3925416147da4523aff458d06f954fe627608b68fd2c4409038f442ded773be1a7a7fd2216248cdeec5f29d5c62fac0f6bf"

RPROVIDES:${PN} += "cmake(qtxdg-tools) qtxdg-tools qtxdg-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xdg.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
