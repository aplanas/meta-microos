SUMMARY = "Italian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Italian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-it-7.0.5-1.1.noarch.rpm"
RPM_HASH = "6091ae77221611946c23399f1bc04ceb20decb14b2de75e1894abbdce260793a017359d2fa0989d305104bba1fbe9be2c017eff4dc12868efd6f89e4373c5751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-it locale(kicad-doc:it)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
