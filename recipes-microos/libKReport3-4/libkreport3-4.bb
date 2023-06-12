SUMMARY = "The library for the Report Creation and generation Framework"
DESCRIPTION = "The main library for the Report creation and generation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "libKReport3-4-3.2.0-4.11.aarch64.rpm"
RPM_HASH = "f4a46e96e6462b108c3fc6d95801503cddce621dd910619d65a9943432e642788af795b0258fb2c742c8aa1eeb002a8e11d12362352674405a3835703c34dc55"

RPROVIDES:${PN} += "libKReport3-4 \
libKReport3-4(aarch-64) \
libKReport3.so.4()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kreport \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKPropertyCore3.so.4()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
