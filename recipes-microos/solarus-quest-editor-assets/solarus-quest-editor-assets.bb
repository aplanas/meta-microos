SUMMARY = "Assets for the Solarus Quest Editor"
DESCRIPTION = "This package contains assets for the Solarus Quest Editor."
LICENSE = "GPL-3.0-or-later & CC-BY-SA-3.0"

PV = "1.6.2"

RPM_NAME = "solarus-quest-editor-assets-1.6.2-2.1.noarch.rpm"
RPM_HASH = "01c64ae36eb680d80659ba9e346cd7d991f7c37047e06579a2821938b3b3bb149f405e679e3139b90dc7373bbde2cb782c968f194be8798bc8b4d4e66e3f96e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solarus-quest-editor-assets"
RDEPENDS:${PN} += ""

inherit rpm
