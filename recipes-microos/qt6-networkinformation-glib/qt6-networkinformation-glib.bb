SUMMARY = "Network information for QNetworkInformation using GNetworkMonitor"
DESCRIPTION = "Plugin using GNetworkMonitor to get network information such as the \
reachability, media type..."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-networkinformation-glib-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "0c08847aef55b8a47221f0af74559f368f20915115fd7478bb552bcecf3ac8f9640569dcdbf13d96460e2ef3aaee413985e846fb943f4a70e70fb0df75db633c"

RPROVIDES:${PN} += "libqglib.so()(64bit) libqglib.so(Qt_6)(64bit) libqglib.so(Qt_6.0)(64bit) libqglib.so(Qt_6.1)(64bit) libqglib.so(Qt_6.2)(64bit) libqglib.so(Qt_6.3)(64bit) libqglib.so(Qt_6.4)(64bit) libqglib.so(Qt_6.5)(64bit) libqglib.so(Qt_6.5.0_PRIVATE_API)(64bit) qt6-networkinformation-glib qt6-networkinformation-glib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
