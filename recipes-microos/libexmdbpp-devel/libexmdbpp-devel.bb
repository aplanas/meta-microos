SUMMARY = "Development files for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains the header files for the library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "libexmdbpp-devel-1.10.4.b7a36f2-1.1.aarch64.rpm"
RPM_HASH = "6a65de4df40dc10c1a0089c6ee65a459040b653d9a19371da31cafaa6141cc92963bbf52fbb5b64d4d580fa4b33ef126a96fb47ce70385af2088a0ce61de716b"

RPROVIDES:${PN} += "libexmdbpp-devel libexmdbpp-devel(aarch-64)"
RDEPENDS:${PN} += "libexmdbpp0"

inherit rpm
