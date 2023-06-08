SUMMARY = "Lasso runtime libraries"
DESCRIPTION = "This package contains the runtime libraries for lasso (Liberty Alliance Single Sign On)."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.2"

RPM_NAME = "liblasso3-2.8.2-1.3.aarch64.rpm"
RPM_HASH = "35052c5dc1e76dd414c8c78b0000386604e6edea9c1130151f5f7899cdc55aeda55f43d99d3d4648252f40ade9c91931eb22d753e1ad9c7c5201530d52b355c3"

RPROVIDES:${PN} += "liblasso.so.3()(64bit) liblasso3 liblasso3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxmlsec1-openssl.so.1()(64bit) libxmlsec1.so.1()(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libz.so.1()(64bit)"

inherit rpm
