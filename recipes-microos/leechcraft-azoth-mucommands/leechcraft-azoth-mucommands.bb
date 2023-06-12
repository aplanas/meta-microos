SUMMARY = "LeechCraft Azoth module for conference-oriented commands"
DESCRIPTION = "This package provides some common conference-oriented commands like \
/vcard, /time, /last, /subject, /kick, /ban and so on for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-azoth-mucommands-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "24e209ef019ab6bd210edc2fe247965d0f08b47f33e0bba4a6ab0d8a7e8b2f4e582ad5fa993fcf24e54950589a6a14a645a138f23166e089b0550d5df95a42a1"

RPROVIDES:${PN} += "leechcraft-azoth-mucommands \
leechcraft-azoth-mucommands(aarch-64) \
libleechcraft_azoth_mucommands.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
leechcraft-azoth-protocolplugin \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sll-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
