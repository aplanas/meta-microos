SUMMARY = "Japanese documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Japanese documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-ja-7.0.2-1.1.noarch.rpm"
RPM_HASH = "4b3919299ecfb82932a5358461c992c733c0420cd73cf0f85c56b10fa24381133629aa15cd0a23c445dde892253d25bde65eb8247badf3252739b8b5003c9efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-ja locale(kicad-doc:ja)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
