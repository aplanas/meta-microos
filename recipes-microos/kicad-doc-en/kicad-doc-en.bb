SUMMARY = "English documentation and tutorials for KiCad"
DESCRIPTION = "This package contains English documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-en-7.0.2-1.1.noarch.rpm"
RPM_HASH = "7198093b499126ff110c1ee9dc341fe92d9e2d40d80bd3dfc5b519d358c6fc1f21735c1034d56c21ab94c1db6962ff6a53ea7a9c27f145810b0759bb30d5456d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-en locale(kicad-doc:en)"
RDEPENDS:${PN} += "kicad kicad-doc"

inherit rpm
