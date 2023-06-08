SUMMARY = "LeechCraft Azoth XMPP Module"
DESCRIPTION = "This package provides an XMPP protocol plugin for LeechCraft Azoth. \
 \
Feature highlights: \
 * Media calls support (Jingle). \
 * Support for PEP and current user activity, mood, tune and location. \
 * Bookmarks with autojoin support. \
 * Full support for MUCs. \
 * Notifications about chat state participation. \
 * Service discovery support. \
 * Gateway support, with registration. \
 * Support for various file transfer methods. \
 * In-band registration of accounts (right from the client). \
 * Privacy lists. \
 * Encrypted and signed messages and presences. \
 * Full CAPTCHA support. \
 * Support for ad-hoc commands. \
 * Support for exchanging roster items. \
 * Search for contacts in Jabber."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-xoox-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "b0f20df2f5e2f42a65b83d009d9027e23f55596857991d4b750d6168397f17d51269c8b462acbf4980ec61038fd9bcdcd0f8b3d0259f3f8dda61ecfbd0f58265"

RPROVIDES:${PN} += "application() application(leechcraft-azoth-xoox-qt5.desktop) leechcraft-azoth-protocolplugin leechcraft-azoth-xoox leechcraft-azoth-xoox(aarch-64) libleechcraft_azoth_xoox.so()(64bit) mimehandler(x-scheme-handler/xmpp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) leechcraft-azoth libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libleechcraft-util-db-qt5.so.0.6.75.1()(64bit) libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) libleechcraft-util-qt5.so.0.6.75()(64bit) libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) libleechcraft-util-threads-qt5.so.0.6.75()(64bit) libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) libqca-qt5.so.2()(64bit) libqxmpp.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit)"

inherit rpm
