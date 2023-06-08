SUMMARY = "KDE PIM Libraries"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kldap-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1d01d06852ad23f5021a89ac9b83d6075cb92ed2c4f807525fa8a88527bff4a047f2cf690aa6da9cd7ef3f00a9aeff4ab7186e638d0a30237b76de6d7b9756d4"

RPROVIDES:${PN} += "kldap kldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKPim5Ldap.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
