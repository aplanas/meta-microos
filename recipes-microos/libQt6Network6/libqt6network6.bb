SUMMARY = "Qt 6 Network library"
DESCRIPTION = "Qt Network provides a set of APIs for programming applications that \
use TCP/IP. Operations such as requests, cookies, and sending data \
over HTTP are handled by various C++ classes."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "libQt6Network6-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "cfa4fe50c7e49ef456f10d0d7ddb2348327f5eedfc191fd1683a74e2354a72c97bf791ba02122c4ac11cf16352f823a0ac1ca6109e804b2542ad096a7616b335"

RPROVIDES:${PN} += "libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libQt6Network.so.6(Qt_6.0)(64bit) libQt6Network.so.6(Qt_6.1)(64bit) libQt6Network.so.6(Qt_6.2)(64bit) libQt6Network.so.6(Qt_6.3)(64bit) libQt6Network.so.6(Qt_6.4)(64bit) libQt6Network.so.6(Qt_6.5)(64bit) libQt6Network.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network6 libQt6Network6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Core6 libQt6DBus6 libbrotlidec.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) qt6-network-tls"

inherit rpm
