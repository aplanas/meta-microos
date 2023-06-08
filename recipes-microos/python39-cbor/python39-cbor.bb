SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-cbor-1.0.0-1.23.aarch64.rpm"
RPM_HASH = "1581f6b6ffcd538b9c76123ad02ab30083535721cc046ea1a4a0dd81b19e2b108228129b3b9ad24ed9c51e97a6f15fa90ff22ec6216eb9d8c3da8167e8e247b3"

RPROVIDES:${PN} += "python3.9dist(cbor) python39-cbor python39-cbor(aarch-64) python3dist(cbor)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-base"

inherit rpm
