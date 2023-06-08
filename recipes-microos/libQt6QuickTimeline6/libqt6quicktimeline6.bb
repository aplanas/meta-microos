SUMMARY = "Qt 6 QuickTimeline library"
DESCRIPTION = "The Qt 6 QuickTimeline library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6QuickTimeline6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c83e34db7dc86ee14c5d69464cda98fc2bfb6809c6d1594ab324b0236307a89d5d4f3bba944aa0f278860936c25fb81fbaf098a137268c642c31cb7a842e6a2f"

RPROVIDES:${PN} += "libQt6QuickTimeline.so.6()(64bit) libQt6QuickTimeline.so.6(Qt_6)(64bit) libQt6QuickTimeline.so.6(Qt_6.0)(64bit) libQt6QuickTimeline.so.6(Qt_6.1)(64bit) libQt6QuickTimeline.so.6(Qt_6.2)(64bit) libQt6QuickTimeline.so.6(Qt_6.3)(64bit) libQt6QuickTimeline.so.6(Qt_6.4)(64bit) libQt6QuickTimeline.so.6(Qt_6.5)(64bit) libQt6QuickTimeline.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6QuickTimeline6 libQt6QuickTimeline6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libQt6Qml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick.so.6()(64bit) libQt6Quick.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
