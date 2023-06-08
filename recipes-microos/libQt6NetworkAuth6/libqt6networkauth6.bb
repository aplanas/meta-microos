SUMMARY = "Qt 6 NetworkAuth library"
DESCRIPTION = "The Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "libQt6NetworkAuth6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "0bdf5ba4dccdb38592c720e296a8f07ec476791c4b6cc48fda27c78bfe68a0e86eedf05daec79d60443b403b05668b8c9fb387b4a1a23e002acafa914b34a310"

RPROVIDES:${PN} += "libQt6NetworkAuth.so.6()(64bit) libQt6NetworkAuth.so.6(Qt_6)(64bit) libQt6NetworkAuth.so.6(Qt_6.0)(64bit) libQt6NetworkAuth.so.6(Qt_6.1)(64bit) libQt6NetworkAuth.so.6(Qt_6.2)(64bit) libQt6NetworkAuth.so.6(Qt_6.3)(64bit) libQt6NetworkAuth.so.6(Qt_6.4)(64bit) libQt6NetworkAuth.so.6(Qt_6.5)(64bit) libQt6NetworkAuth.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6NetworkAuth6 libQt6NetworkAuth6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
