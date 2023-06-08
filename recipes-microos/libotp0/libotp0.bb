SUMMARY = "One Time Password library for Heimdal Kerberos"
DESCRIPTION = "This package contains the library for One Time Password support."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libotp0-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "98086a158452af8f3017a714a70f6b0045b9a37b6847fdb5ac47c9db2a900b63e58f30ce39176b35027b32a2cf3648865f9df8cf22b0a5750bb5c38d20431053"

RPROVIDES:${PN} += "libotp.so.0()(64bit) libotp.so.0(HEIMDAL_OTP_1.0)(64bit) libotp0 libotp0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libdb-4.8.so()(64bit) libhcrypto.so.4()(64bit) libhcrypto.so.4(HEIMDAL_CRYPTO_1.0)(64bit)"

inherit rpm
