SUMMARY = "Catalan documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Catalan documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-ca-7.0.2-1.1.noarch.rpm"
RPM_HASH = "e7080c337d01a7e4d49cfd6d4406d64480b5d6e49463f3ba6ab1835af4cfb9f7c48baa20d22b7d227f03825066de05059fafa1f614e1e5528faa4b3df1f50314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ca locale(kicad-doc:ca)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
