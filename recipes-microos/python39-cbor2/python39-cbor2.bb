SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python39-cbor2-5.4.6-1.5.aarch64.rpm"
RPM_HASH = "d289cec5e8a164bf07862a8ff51149500fccf519ee008f92458be2f594885bd93872eee21e77eabd9c4f366bba8e6d372a966e2d7a7b728c69c77de365242317"

RPROVIDES:${PN} += "python3.9dist(cbor2) \
python39-cbor2 \
python39-cbor2(aarch-64) \
python3dist(cbor2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
