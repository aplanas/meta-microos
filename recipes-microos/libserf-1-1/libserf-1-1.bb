SUMMARY = "High-Performance Asynchronous HTTP Client Library"
DESCRIPTION = "The serf library is a C-based HTTP client library built upon the Apache \
Portable Runtime (APR) library. It multiplexes connections, running the \
read/write communication asynchronously. Memory copies and transformations are \
kept to a minimum to provide high performance operation."
LICENSE = "Apache-2.0"

PV = "1.3.9"

RPM_NAME = "libserf-1-1-1.3.9-7.1.aarch64.rpm"
RPM_HASH = "5552b3e2d3db6c0c417d54e212f90d0720498b2983f730917a9d7fecad524fa968cf333b06881f64e3ce81ff346f22ba05bd62fea70b38f4f51a5814cd410fa9"

RPROVIDES:${PN} += "libserf-1-1 libserf-1-1(aarch-64) libserf-1.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-1.so.0()(64bit) libaprutil-1.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcom_err.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libgdbm.so.6()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libk5crypto.so.3()(64bit) libkrb5.so.3()(64bit) liblber.so.2()(64bit) libldap.so.2()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit)"

inherit rpm
