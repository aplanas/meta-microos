SUMMARY = "JsonRpc 2.0 protocol implementation"
DESCRIPTION = "JsonRpc 2.0 protocol implementation for Qt6."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6JsonRpc6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "01ad4b1a50a6d30a3d780e671e00d6aabe9809980344c07ddbc7bb8b57f93f38886bc6b984e294eeb2df1f9e11d43f61f41f1a7fa3ba4d1eb1d069c291e39f52"

RPROVIDES:${PN} += "libQt6JsonRpc.so.6()(64bit) libQt6JsonRpc.so.6(Qt_6)(64bit) libQt6JsonRpc.so.6(Qt_6.0)(64bit) libQt6JsonRpc.so.6(Qt_6.1)(64bit) libQt6JsonRpc.so.6(Qt_6.2)(64bit) libQt6JsonRpc.so.6(Qt_6.3)(64bit) libQt6JsonRpc.so.6(Qt_6.4)(64bit) libQt6JsonRpc.so.6(Qt_6.5)(64bit) libQt6JsonRpc.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6JsonRpc6 libQt6JsonRpc6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
