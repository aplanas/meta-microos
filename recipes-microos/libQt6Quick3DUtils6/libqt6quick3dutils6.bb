SUMMARY = "Qt 6 Quick3DUtils library"
DESCRIPTION = "The Qt 6 Quick3DUtils library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DUtils6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "1104fa0b6eca37029f3413a09c2159f47c96cbe889ef06422add81c31a9c71be1e51aa395af1ae9cf19ec865cbac39a6fa2efbe88b546e0f77e6250125cb9624"

RPROVIDES:${PN} += "libQt6Quick3DUtils.so.6()(64bit) libQt6Quick3DUtils.so.6(Qt_6)(64bit) libQt6Quick3DUtils.so.6(Qt_6.0)(64bit) libQt6Quick3DUtils.so.6(Qt_6.1)(64bit) libQt6Quick3DUtils.so.6(Qt_6.2)(64bit) libQt6Quick3DUtils.so.6(Qt_6.3)(64bit) libQt6Quick3DUtils.so.6(Qt_6.4)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5)(64bit) libQt6Quick3DUtils.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DUtils6 libQt6Quick3DUtils6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit)"

inherit rpm
