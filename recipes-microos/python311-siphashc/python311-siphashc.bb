SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "1.3"

RPM_NAME = "python311-siphashc-1.3-3.15.aarch64.rpm"
RPM_HASH = "b9380a237a7a6935bb1d537c0b93871efee1ae6af9c4b7b09d3c2509fbc51c3750d25d53d599db460b3c311dea160fc3076235c689255e12189515f6cd169b66"

RPROVIDES:${PN} += "python3.11dist(siphashc) python311-siphashc python311-siphashc(aarch-64) python311-siphashc3 python3dist(siphashc)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
