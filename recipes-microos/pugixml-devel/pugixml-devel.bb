SUMMARY = "Development Files for pugixml"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using pugixml."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "pugixml-devel-1.13-1.3.aarch64.rpm"
RPM_HASH = "8ac0f4f6dc1bae7a0d6ef3bafe73749f4d5524aa1955c7ef5960e0b904276e8fb755bfb20fccbf8c028977bbca7cd295bf519562cbfe69e31d2e07f28bab3fa8"

RPROVIDES:${PN} += "cmake(pugixml) pkgconfig(pugixml) pugixml-devel pugixml-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libpugixml1"

inherit rpm
