SUMMARY = "Qt 5 QtTools Module"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application development. \
 \
Included are QtAssistant (help browser), QtDesigner (GUI design), QDbusViewer \
and several more."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "15903b9874613f84bb038cb7ac5a14c2f12a41e97f68a56675b072e22ac29ed1d0ffe94b68e41e5286ec78cd549e673a91a47c41b0e3bcaddd2bde007efbcc54"

RPROVIDES:${PN} += "application() \
application(assistant5.desktop) \
application(designer5.desktop) \
application(qdbusviewer5.desktop) \
cmake(Qt5AttributionsScannerTools) \
libqquickwidget.so()(64bit) \
libqt5-qttools \
libqt5-qttools(aarch-64) \
mimehandler(application/x-assistant) \
mimehandler(application/x-designer)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5DBus.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5DBus5 \
libQt5Designer.so.5()(64bit) \
libQt5Designer.so.5(Qt_5)(64bit) \
libQt5DesignerComponents.so.5()(64bit) \
libQt5DesignerComponents.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libqt5-qdbus \
libqt5-qtpaths \
libqt5-qttools-qhelpgenerator \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
