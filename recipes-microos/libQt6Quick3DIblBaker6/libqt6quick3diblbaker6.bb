SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b463a298e9a84d800d97e15468652d696b916a73e8d742c54a1d6835393341d79c522f0acde89bef1d9a1c05cf01f2891c5b192646f964b7713d3c070595752e"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6()(64bit) libQt6Quick3DIblBaker.so.6(Qt_6)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.0)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.1)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.2)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.3)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.4)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.5)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DIblBaker6 libQt6Quick3DIblBaker6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
