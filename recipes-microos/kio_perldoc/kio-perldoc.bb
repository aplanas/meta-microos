SUMMARY = "KDE KIO-Slave to browse Perl documentation"
DESCRIPTION = "This KDE KIO slave allows to browse the Perl documentation."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kio_perldoc-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "44c744fe0fa7e9967e22f4a5a0788beb196bcada33934761ca9051618cca256b53ab58993348af7cabfdb9e54f7a71184dd7c8417a7ad665dc02e9a140eb301f"

RPROVIDES:${PN} += "kdesdk-kioslaves \
kio_perldoc \
kio_perldoc(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
