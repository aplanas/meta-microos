SUMMARY = "Qt dock widget library, suitable for replacing QDockWidget"
DESCRIPTION = "KDDockWidgets is a Qt dock widget library written by KDAB, suitable for \
replacing QDockWidget and implementing advanced functionalities missing in Qt. \
 \
Although KDDockWidgets is ready to be used out of the box, it can also be seen \
as a framework to allow building very tailored custom docking systems. It tries \
to expose every internal widget and every knob for the app developer to tune."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "libkddockwidgets1_7-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "e0ca534b60650fe9519af46eba906d54f7f495b45422566a63a912690bc9f9eda1ea515eaf579884ac3677bf2dba6c014da82e966fb38956a378f338a8ba8b76"

RPROVIDES:${PN} += "libkddockwidgets.so.1.7()(64bit) libkddockwidgets1_7 libkddockwidgets1_7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
