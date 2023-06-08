SUMMARY = "Development files for liblinebreak"
DESCRIPTION = "The liblinebreak-devel package contains libraries and header files for \
developing applications that use liblinebreak."
LICENSE = "Zlib"

PV = "2.1"

RPM_NAME = "liblinebreak-devel-2.1-16.25.aarch64.rpm"
RPM_HASH = "797bde48453d3c4ff6073f2b3c6ebfbd0d4a2c7197b535f732c10e9155688066baab046aedeb98ed699c01e6b1f8b9bbc906a122cbb77ae45310fd610a4fbb66"

RPROVIDES:${PN} += "liblinebreak-devel liblinebreak-devel(aarch-64)"
RDEPENDS:${PN} += "liblinebreak"

inherit rpm
