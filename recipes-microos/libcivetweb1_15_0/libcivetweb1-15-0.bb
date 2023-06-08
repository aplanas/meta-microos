SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libcivetweb1_15_0-1.15-2.8.aarch64.rpm"
RPM_HASH = "32d7e15d6315a15911eeec142ca8c856ac088c42f7e26797b00095b5520652c3e3095f4a7c7e90ea84c29ce6ebc8396eaa3a3a758d3674c4b3488c5cecc2d7fe"

RPROVIDES:${PN} += "libcivetweb.so.1.15.0()(64bit) libcivetweb1_15_0 libcivetweb1_15_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
