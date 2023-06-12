SUMMARY = "Pure Python CBOR (de)serializer with extensive tag support"
DESCRIPTION = "Pure Python CBOR (de)serializer with extensive tag support"
LICENSE = "MIT"

PV = "5.4.6"

RPM_NAME = "python311-cbor2-5.4.6-1.5.aarch64.rpm"
RPM_HASH = "b1706eb8f61ce6935b9ed003f59981dca0faaf9382200d28a6a888e5a1985aab137324cbbe6ea6e7843062aa78b04e8da30cadeee9a6051ee908516f7ac62e29"

RPROVIDES:${PN} += "python3.11dist(cbor2) \
python311-cbor2 \
python311-cbor2(aarch-64) \
python3dist(cbor2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
