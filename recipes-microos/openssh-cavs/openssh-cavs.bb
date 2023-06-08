SUMMARY = "OpenSSH FIPS crypto module CAVS tests"
DESCRIPTION = "This package contains the FIPS-140 CAVS (Cryptographic Algorithm \
Validation Program/Suite) related tests of OpenSSH."
LICENSE = "BSD-2-Clause & MIT"

PV = "8.9p1"

RPM_NAME = "openssh-cavs-8.9p1-9.1.aarch64.rpm"
RPM_HASH = "b018433bbd8bbd907b0b9a9bf307ad96ea12c91ac3c034210b985c5be26aa1bc5f9c5b16f4ce25933f7dc3f91edb62fd96c1831a6233020e2c95befae5db9ad6"

RPROVIDES:${PN} += "openssh-cavs openssh-cavs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfido2.so.1()(64bit) libz.so.1()(64bit) openssh-common"

inherit rpm
