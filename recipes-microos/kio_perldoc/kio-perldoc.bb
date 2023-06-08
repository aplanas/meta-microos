SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kio_perldoc-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b447d549c77024bfaa9e01a8544c9416b07643abb9c73af423bbe13406606bdb26118da4de952dbb5b57637767a9e9ff75060e8f016ae4d2a11d7429f4a61874"

RPROVIDES:${PN} += "kdesdk-kioslaves kio_perldoc kio_perldoc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
