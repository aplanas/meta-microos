SUMMARY = "Network information for QNetworkInformation"
DESCRIPTION = "Plugin used to get network information such as the reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-networkinformation-nm-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "eeba2e93d588da41ced0dcb2ed8c5ac216f999fc98a6b7927571314712fc9ecf84f88f8a3751c15b7f6ff8dd7cb14d46d06e0f61a367309c6a85f546174174ac"

RPROVIDES:${PN} += "libqnetworkmanager.so()(64bit) libqnetworkmanager.so(Qt_6)(64bit) libqnetworkmanager.so(Qt_6.0)(64bit) libqnetworkmanager.so(Qt_6.1)(64bit) libqnetworkmanager.so(Qt_6.2)(64bit) libqnetworkmanager.so(Qt_6.3)(64bit) libqnetworkmanager.so(Qt_6.4)(64bit) libqnetworkmanager.so(Qt_6.5)(64bit) libqnetworkmanager.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-network-informationbackends qt6-networkinformation-nm qt6-networkinformation-nm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
