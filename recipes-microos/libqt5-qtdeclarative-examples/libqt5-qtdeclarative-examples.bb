SUMMARY = "Qt5 quick/qml examples"
DESCRIPTION = "Examples for libqt5-qtdeclarative (quick/qml) modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde23"

RPM_NAME = "libqt5-qtdeclarative-examples-5.15.9+kde23-1.1.aarch64.rpm"
RPM_HASH = "4ec6e4ffb89c4b46e274fc111266478a5e56d0b0be09dfbc1cbcbde0e3bc2675b4811fc5c6ac7b34a3aceaeeadc8172e169f5e6d0d5a97e38f10db42fae8b040"

RPROVIDES:${PN} += "libchartsplugin.so()(64bit) libqmlimageproviderplugin.so()(64bit) libqmlimageresponseproviderplugin.so()(64bit) libqmlqtimeexampleplugin.so()(64bit) libqmltextballoonplugin.so()(64bit) libqt5-qtdeclarative-examples libqt5-qtdeclarative-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5QuickTest.so.5()(64bit) libQt5QuickTest.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Test.so.5()(64bit) libQt5Test.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
