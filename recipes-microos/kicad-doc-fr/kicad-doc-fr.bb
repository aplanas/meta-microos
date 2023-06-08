SUMMARY = "French documentation and tutorials for KiCad"
DESCRIPTION = "This package contains French documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-fr-7.0.2-1.1.noarch.rpm"
RPM_HASH = "0a707c3612b0bcef71dd9234465578601b60d54e7646d013289cb1eb92e962bbf3f652889cfe0505be2596754d37ad88def4b53fe8211450c5d06999515fea7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-fr locale(kicad-doc:fr)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
