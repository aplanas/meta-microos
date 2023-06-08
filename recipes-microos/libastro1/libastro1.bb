SUMMARY = "Astronomy: Shared Library"
DESCRIPTION = "The astronomy library for the satellites plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libastro1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8f26d6f9eabefb2c0aa4749f9f246ee145253eed8acffc365d15c6e8a998ecec96ecc58470a718ad687edc7e361cf54a6ed4fd51068de100e419a4bb35c105f9"

RPROVIDES:${PN} += "libastro-qt5-1 libastro.so.1()(64bit) libastro1 libastro1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmarblewidget-qt5-28 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
