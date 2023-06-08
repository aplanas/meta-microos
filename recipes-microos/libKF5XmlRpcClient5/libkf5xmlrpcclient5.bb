SUMMARY = "Library containing simple XML-RPC Client support"
DESCRIPTION = "Library containing simple XML-RPC Client support."
LICENSE = "BSD-2-Clause"

PV = "5.105.0"

RPM_NAME = "libKF5XmlRpcClient5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7c65d0ef85f059c40c987a0b1e4079212ac18a6b50535de25ab61cf2dcc73d032a130ae490bd5ad2da6a8aa9102f985833d3881e40b6f56ce86c643ca204ca52"

RPROVIDES:${PN} += "libKF5XmlRpcClient.so.5()(64bit) libKF5XmlRpcClient5 libKF5XmlRpcClient5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
