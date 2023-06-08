SUMMARY = "Development files for libaom, an AV1 codec library"
DESCRIPTION = "This package contains the development headers and library files for \
libaom, a library for the AOMedia Video 1 (AV1) video coding format."
LICENSE = "BSD-2-Clause"

PV = "3.6.0"

RPM_NAME = "libaom-devel-3.6.0-2.1.aarch64.rpm"
RPM_HASH = "f31cd466900c8b00420bad19b9d1af414e54ba83edc278ed3116dd1f0113e076d34e7872c2ae14c72582ae2f50ca6f043dc649b2c774c80b32574a16e82d4a64"

RPROVIDES:${PN} += "libaom-devel libaom-devel(aarch-64) pkgconfig(aom)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libaom3"

inherit rpm
