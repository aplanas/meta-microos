SUMMARY = "Header-only C++ UniqueFactory"
DESCRIPTION = "Header-only C++ UniqueFactory"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1"

RPM_NAME = "unique-factory-devel-0.2.1-1.3.aarch64.rpm"
RPM_HASH = "17b6de8cd551fc1bbd282a7618277a2b0d20247798938bcddd9436dec4237b033f8fdfa273b5af3b0f92a198249050a597d02d09f76965ab0d4ee9f0b8fa490c"

RPROVIDES:${PN} += "unique-factory-devel unique-factory-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
