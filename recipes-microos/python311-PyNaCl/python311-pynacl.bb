SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-PyNaCl-1.5.0-3.1.aarch64.rpm"
RPM_HASH = "bce33dbef883bcb83fb4c385fd06b5d7b2bbc3b620e137cbff20f9b33b01667fa5fe85e59cec0a4c5dc2ab01d8922b1a63556bd1aa92c13f2c69077d2762da01"

RPROVIDES:${PN} += "python3.11dist(pynacl) python311-PyNaCl python311-PyNaCl(aarch-64) python3dist(pynacl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsodium.so.23()(64bit) python(abi) python311-cffi"

inherit rpm
