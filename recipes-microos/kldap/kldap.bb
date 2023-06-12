SUMMARY = "KDE PIM Libraries"
DESCRIPTION = "This package contains additional libraries for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kldap-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0cafd2c266951cc8a149ffffe0d1741394dcb4375d964f4b332060531a43b78f9dcb513645b0defc58906b7660e99ff1d4e5fa6bfe3a9130614b3ca9f352f7b2"

RPROVIDES:${PN} += "kldap \
kldap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKPim5Ldap.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
