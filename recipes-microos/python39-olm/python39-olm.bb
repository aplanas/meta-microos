SUMMARY = "Double Ratchet cryptographic library"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet . \
This package contains python39 bindings for olm."
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "python39-olm-3.2.14-1.5.aarch64.rpm"
RPM_HASH = "54e779a2ec7a2cab439f0b817b7dd9519b25171db7b97c24b909d34e5de082adebb32455ae1e44c45d9b249e8bbe4f1d17c76e8f2de7206c927a884c5b0dd6b5"

RPROVIDES:${PN} += "python3.9dist(python-olm) python39-olm python39-olm(aarch-64) python3dist(python-olm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libolm.so.3()(64bit) libolm3 python(abi) python39-cffi python39-future"

inherit rpm
