SUMMARY = "Bindings for scrypt"
DESCRIPTION = "Bindings for the scrypt key derivation function library."
LICENSE = "BSD-2-Clause"

PV = "0.8.20"

RPM_NAME = "python39-scrypt-0.8.20-1.7.aarch64.rpm"
RPM_HASH = "bb3bca3b12a211bafbe0d59c1930277da7979d62b675355919ff5bbc178a14b1b518a1aa289204712184e26636abc9150f9e9f3a44fc0ab10f64065de9e2ad46"

RPROVIDES:${PN} += "python3.9dist(scrypt) python39-scrypt python39-scrypt(aarch-64) python3dist(scrypt)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) python(abi)"

inherit rpm
