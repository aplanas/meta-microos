SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-PyNaCl-1.5.0-3.1.aarch64.rpm"
RPM_HASH = "5cb56115583ded01b7e5cf367156c39c159f51d5363f140c6260464bb886338a05a58e465a1433ae62cffda53093359be8d19707e5770d1fa80e2a99e1936bd7"

RPROVIDES:${PN} += "python3-PyNaCl \
python3.10dist(pynacl) \
python310-PyNaCl \
python310-PyNaCl(aarch-64) \
python3dist(pynacl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsodium.so.23()(64bit) \
python(abi) \
python310-cffi"

inherit rpm
