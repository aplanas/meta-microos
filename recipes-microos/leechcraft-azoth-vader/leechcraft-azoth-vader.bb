SUMMARY = "LeechCraft Azoth MrIM Module"
DESCRIPTION = "This package provides a MRIM protocol plugin for LeechCraft Azoth. \
 \
The MRIM protocol is used in the Mail.Ru Agent IM service. \
 \
Vader is based on an own implementation of the MRIM protocol, partially based \
on available (and outdated) official specs, and is partly reverse-engineered. \
 \
The following protocol features are supported: \
 * Extended statuses. \
 * Attention requests (alarms). \
 * Publishing current tune and fetching others' tune. \
 * Message delivery receipts. \
 * Mailbox notifications. \
 * Opening mailbox without login. \
 * Authorization management. \
 * Grouping contacts."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-vader-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "8ba773c547a2d5556335ec00e8d9a90013858d7a5ab5783e72975ab9a8688a36e008670c264c4b0abca6bd1277f69ce08cb87129a6d7d427b8b2fde8658fc51e"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin leechcraft-azoth-vader leechcraft-azoth-vader(aarch-64) libleechcraft_azoth_vader.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit)"

inherit rpm
