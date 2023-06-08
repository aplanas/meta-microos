SUMMARY = "Polish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Polish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-pl-7.0.2-1.1.noarch.rpm"
RPM_HASH = "7cef04befe9a920f146b2d4be397dc954869c5de91c89a756805a097c01d35f58cfba8dc9f5bdd8f8bcdac5bd375599addb7119cace180f058e6aa8a6516c14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-pl locale(kicad-doc:pl)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
