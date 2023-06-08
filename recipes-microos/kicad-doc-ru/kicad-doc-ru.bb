SUMMARY = "Russian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Russian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-ru-7.0.2-1.1.noarch.rpm"
RPM_HASH = "2176c64f0db957afcec0322f3c0a9b81320a2ff1734a0b6a46707bd8cf9a88ce666550ca4b88b8151bea1f59c9234bfe10a95b6f55bd0c34eded7bd68c0fc5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ru locale(kicad-doc:ru)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
