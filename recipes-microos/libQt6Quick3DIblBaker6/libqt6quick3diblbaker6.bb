SUMMARY = "Qt 6 Quick3DIblBaker library"
DESCRIPTION = "The Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3DIblBaker6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4c859ab4cb8f8a9e5c27e3587b08b6a1bce60ba8764809c9f1facb8560a65fe6f6ce18dc23cbe6bc745911d03adc5451f7daf6c33a0422d51189fee9cd0bca9c"

RPROVIDES:${PN} += "libQt6Quick3DIblBaker.so.6()(64bit) libQt6Quick3DIblBaker.so.6(Qt_6)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.0)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.1)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.2)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.3)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.4)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.5)(64bit) libQt6Quick3DIblBaker.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick3DIblBaker6 libQt6Quick3DIblBaker6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libQt6Quick3DRuntimeRender.so.6()(64bit) libQt6Quick3DRuntimeRender.so.6(Qt_6.5.1_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
