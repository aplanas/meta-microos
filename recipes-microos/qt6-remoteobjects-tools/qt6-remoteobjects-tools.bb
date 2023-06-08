SUMMARY = "Qt 6 RemoteObjects Tools"
DESCRIPTION = "This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-tools-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "8f8ec60d6cb5c7c0277b384727249b540db86b2bc2983dd03e0792a18fcffb66315564e526bcfe00b07805d7e5a083380aa2ad5b27b93819861ccdcee6661c04"

RPROVIDES:${PN} += "qt6-remoteobjects-tools qt6-remoteobjects-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
