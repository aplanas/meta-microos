SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5ItemModels5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "2f5a7a3ab8509332703d2ca9f67bc3a83fa9bf6205c97763240091c7a18aa61fe97c7943f999173b8095fb63d98688e0019c63a6a76eb9b49246a86c7d40b29b"

RPROVIDES:${PN} += "libKF5ItemModels.so.5()(64bit) libKF5ItemModels5 libKF5ItemModels5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core5 libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
