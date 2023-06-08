SUMMARY = "GUI frontend for sudo"
DESCRIPTION = "A graphical frontend for plain sudo (for requesting optional password in GUI \
fashion). \
When invoked it simply spawns child sudo process with requested command (and \
arguments). If sudo requests user's password, the GUI password dialog is shown \
and (after submit) the password is provided to sudo."
LICENSE = "LGPL-2.1-only"

PV = "1.3.0"

RPM_NAME = "lxqt-sudo-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "f909b31ec5e74b5008759d412cda536e67134267381b181de5f60385fce49b16fe87b67863250f8d1e890df2f134782177101894fcc394d31582cef9b34e7bd5"

RPROVIDES:${PN} += "lxqt-sudo lxqt-sudo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblxqt.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) sudo"

inherit rpm
