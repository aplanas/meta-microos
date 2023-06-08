SUMMARY = "KDE PIM Libraries: Mailbox functionality"
DESCRIPTION = "This package provides the mailbox functionality for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Mbox5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a3b1fcf75aafa9334ab2ec6fc8de01d67968c6760f9f1560c415f26546a41b329a34b57bcdff88af6e613f6b9b289f83327652ff105b241e51ae88fb8faf90bc"

RPROVIDES:${PN} += "libKPim5Mbox.so.5()(64bit) libKPim5Mbox5 libKPim5Mbox5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
