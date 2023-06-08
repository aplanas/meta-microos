SUMMARY = "LeechCraft Collection Checker Module"
DESCRIPTION = "This package provides a collection checker plugin for LeechCraft \
to check the completeness of collections."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-brainslugz-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b8058f7de89afd729fcd6a6338ba4333169c52ed89256a3fc580da8af5e0ea39c4ef90d772cd1db6fdea6c668da3fcf4905ad7ffcf5cfc8486e3c85bcb0b3328"

RPROVIDES:${PN} += "leechcraft-lmp-brainslugz leechcraft-lmp-brainslugz(aarch-64) libleechcraft_lmp_brainslugz.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-lmp leechcraft-musiczombie leechcraft-scrobbler libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-qml-qt5.so.0.6.75.2()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) qt5qmlimport(QtQuick.2)"

inherit rpm
