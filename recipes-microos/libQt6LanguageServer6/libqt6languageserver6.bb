SUMMARY = "LSP implementation for Qt6"
DESCRIPTION = "The Qt 6 LanguageServer library implements the Language Server Protocol (LSP) \
specification."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6LanguageServer6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "70484728ee55eabd5a4c041986e8bde7785dfade8050a089784189e49077dc885cefbf4c6fa1c701f929906a44bb496b6adcc2d0802c093f2027d0030e40b764"

RPROVIDES:${PN} += "libQt6LanguageServer.so.6()(64bit) libQt6LanguageServer.so.6(Qt_6)(64bit) libQt6LanguageServer.so.6(Qt_6.0)(64bit) libQt6LanguageServer.so.6(Qt_6.1)(64bit) libQt6LanguageServer.so.6(Qt_6.2)(64bit) libQt6LanguageServer.so.6(Qt_6.3)(64bit) libQt6LanguageServer.so.6(Qt_6.4)(64bit) libQt6LanguageServer.so.6(Qt_6.5)(64bit) libQt6LanguageServer.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LanguageServer6 libQt6LanguageServer6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6JsonRpc.so.6()(64bit) libQt6JsonRpc.so.6(Qt_6)(64bit) libQt6JsonRpc.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
