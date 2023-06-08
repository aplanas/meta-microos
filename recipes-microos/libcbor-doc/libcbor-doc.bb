SUMMARY = "Library for parsing Concise Binary Object Representation (CBOR)"
DESCRIPTION = "libcbor is a C99 library for parsing and generating CBOR (RFC 7049), \
a general-purpose schema-less binary data format. \
 \
It supports flexible memory management, UTF-8, streams & incremental \
processing, and has a layered architecture."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "libcbor-doc-0.10.2-1.1.aarch64.rpm"
RPM_HASH = "8ee62de7dc06d8f683735377ff20ad3ca74d9bea07cc47a4c79da50fee6b1799a2a3aa44b7356ed5e1cc457137e19d4f50da50da5937ea3baf18b1eada57daff"

RPROVIDES:${PN} += "libcbor-doc libcbor-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
