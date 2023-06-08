SUMMARY = "Qt dock widget library, suitable for replacing QDockWidget"
DESCRIPTION = "KDDockWidgets is a Qt dock widget library written by KDAB, suitable for \
replacing QDockWidget and implementing advanced functionalities missing in Qt. \
 \
Although KDDockWidgets is ready to be used out of the box, it can also be seen \
as a framework to allow building very tailored custom docking systems. It tries \
to expose every internal widget and every knob for the app developer to tune."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "libkddockwidgets-qt6-1_7-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "e50545f9fd0ff7cdcef76b0b22ac696e3e0f438522fdc63a4f0f2cb7bd1e748c6b29e844806c8e1d936577fd0f9b00471f6a109abc4cac9fcab0b6a066fece85"

RPROVIDES:${PN} += "libkddockwidgets-qt6-1_7 libkddockwidgets-qt6-1_7(aarch-64) libkddockwidgets-qt6.so.1.7()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Widgets.so.6()(64bit) libQt6Widgets.so.6(Qt_6)(64bit) libQt6Widgets.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
