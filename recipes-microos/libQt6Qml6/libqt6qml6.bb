SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Qml6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "446e1ec5dbccf2fe2488e8a734762beec1f9f7ee756b807cb2b7adfc6e75319793b33f0bd00dc9dc3af935fbb60dc009a87259fbc45bbebf183f5b562ab41bdd"

RPROVIDES:${PN} += "libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.0)(64bit) libQt6Qml.so.6(Qt_6.1)(64bit) libQt6Qml.so.6(Qt_6.2)(64bit) libQt6Qml.so.6(Qt_6.3)(64bit) libQt6Qml.so.6(Qt_6.4)(64bit) libQt6Qml.so.6(Qt_6.5)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml6 libQt6Qml6(aarch-64)"
RDEPENDS:${PN} += "(qml-autoreqprov if rpm-build) /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) qt6-declarative-imports"

inherit rpm
