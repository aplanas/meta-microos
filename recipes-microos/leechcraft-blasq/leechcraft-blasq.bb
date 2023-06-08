SUMMARY = "LeechCraft Image storage Module"
DESCRIPTION = "This package provides a modular image storage plugin for LeechCraft \
which supports different cloud image stores like Picasa or Flickr."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-blasq-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "c8aed23644fde80917f88e5e94eed56120450a3e2bc25ce5bb15a68e058a8e311d4ea5adb083949cb0d56514361f6a09366654082d1a720b028c65a56fd9562a"

RPROVIDES:${PN} += "leechcraft-blasq leechcraft-blasq(aarch-64) libleechcraft_blasq.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft leechcraft-blasq-subplugin libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qml-qt5.so.0.6.75.2()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQuick.2)"

inherit rpm
