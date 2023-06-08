SUMMARY = "German documentation and tutorials for KiCad"
DESCRIPTION = "This package contains German documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-de-7.0.2-1.1.noarch.rpm"
RPM_HASH = "1ad595da7eb30ce0845907af05524a71d653200d9666fbf5ae44c8fcaa63e9869255e84ed3ac005266b6621a674218f30ed001fc230a4bc86737759c226a1b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-de locale(kicad-doc:de)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
