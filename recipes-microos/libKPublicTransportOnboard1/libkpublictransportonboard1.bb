SUMMARY = "Library for querying public transport data onboard trains"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
transport journey queries. This package contains a library to determine \
the presence onboard of a train using WiFi SSIDs and provide journey \
details."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libKPublicTransportOnboard1-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3928f581064a51b024c6b2c632e2916b084e2ffc04156467d945fc8b2e9b8f5db8261ea6f5b98cc819367cdc8d4b3af2fa94228bcc8a872ce60c4c3d722a6f27"

RPROVIDES:${PN} += "libKPublicTransportOnboard.so.1()(64bit) libKPublicTransportOnboard1 libKPublicTransportOnboard1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18nLocaleData.so.5()(64bit) libKPublicTransport.so.1()(64bit) libKPublicTransport1 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
