SUMMARY = "A Qt platform integration plugin"
DESCRIPTION = "The libqt5-dxcbplugin is the Qt platform dxcbp plugin for Deepin Desktop \
Environment."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.9"

RPM_NAME = "libqt5-dxcbplugin-5.6.9-1.1.aarch64.rpm"
RPM_HASH = "9fc070e3aadc7e5366110a0035c44c9ae5bacbab691e9b104a52f232454ae8889d0e7856230f02ec8234217e4ac0780d0439ea0370fb74341df272c984831a30"

RPROVIDES:${PN} += "libdxcb.so()(64bit) libqt5-dxcbplugin libqt5-dxcbplugin(aarch-64)"
RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5XcbQpa.so.5()(64bit) libQt5XcbQpa.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libX11.so.6()(64bit) libXi.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxcb-composite.so.0()(64bit) libxcb-damage.so.0()(64bit) libxcb-icccm.so.4()(64bit) libxcb-shape.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
