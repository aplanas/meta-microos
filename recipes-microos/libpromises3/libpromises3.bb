SUMMARY = "Shared library of cfengine"
DESCRIPTION = "This package contains the shared libpromises (cfengine) library."
LICENSE = "GPL-3.0-only"

PV = "3.21.0"

RPM_NAME = "libpromises3-3.21.0-1.4.aarch64.rpm"
RPM_HASH = "486ccf9737c199e0c7d32c287753b82c40a9c947bd435ba35c7921e25da1636b4eedd40c853c91bd6a8f72b57849644ecbe902a0bf778a81f35a458396f30397"

RPROVIDES:${PN} += "libpromises.so.3()(64bit) libpromises1 libpromises3 libpromises3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblmdb-0.9.30.so()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpcre.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
