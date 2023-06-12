SUMMARY = "Examples for the qt6-declarative module"
DESCRIPTION = "Examples for the qt6-declarative module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-examples-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e0da7e1abe4dc91ff452028b67a87f68219373ce2843e2c0dc853ca822bb70ce5216ae22649e535081cfded405d025c7ce47a6da7ba95788f0b5ea73ece6db69"

RPROVIDES:${PN} += "libMyStyle.so()(64bit) \
libaffectors_shared.so()(64bit) \
libanimation_shared.so()(64bit) \
libcanvas_shared.so()(64bit) \
libchartsplugin.so()(64bit) \
libdelegatechooser_shared.so()(64bit) \
libdraganddrop_shared.so()(64bit) \
libemitters_shared.so()(64bit) \
libimageelements_shared.so()(64bit) \
libimageparticle_shared.so()(64bit) \
libitemparticle_shared.so()(64bit) \
libitemswitcher_shared.so()(64bit) \
libpositioners_shared.so()(64bit) \
libqmlimageproviderplugin.so()(64bit) \
libqmlimageresponseproviderplugin.so()(64bit) \
libqmlqtimeexample.so()(64bit) \
libqmltextballoon.so()(64bit) \
librighttoleft_shared.so()(64bit) \
libshapes_shared.so()(64bit) \
libsystem_shared.so()(64bit) \
libtestbed_shared.so()(64bit) \
libtext_shared.so()(64bit) \
libthreading_shared.so()(64bit) \
libtouchinteraction_shared.so()(64bit) \
libviews_shared.so()(64bit) \
libwindow_shared.so()(64bit) \
qt6-declarative-examples \
qt6-declarative-examples(aarch-64) \
qt6-quickcontrols2-examples"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6QuickControls2.so.6()(64bit) \
libQt6QuickControls2.so.6(Qt_6)(64bit) \
libQt6QuickTest.so.6()(64bit) \
libQt6QuickTest.so.6(Qt_6)(64bit) \
libQt6QuickWidgets.so.6()(64bit) \
libQt6QuickWidgets.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Test.so.6()(64bit) \
libQt6Test.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
