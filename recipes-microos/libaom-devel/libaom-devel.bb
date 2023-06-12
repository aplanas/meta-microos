SUMMARY = "Development files for libaom, an AV1 codec library"
DESCRIPTION = "This package contains the development headers and library files for \
libaom, a library for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.1"

RPM_NAME = "libaom-devel-3.6.1-1.1.aarch64.rpm"
RPM_HASH = "778358876fd8180b7d9826b9c403bf43d1a0ee786df6dfb0b76a1bf29030b0f9254f489333c1b68eaa46aa276a19084c5bcd9dceddcec74091b8c8ba523a6d30"

RPROVIDES:${PN} += "libaom-devel libaom-devel(aarch-64) pkgconfig(aom)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaom3"

inherit rpm
