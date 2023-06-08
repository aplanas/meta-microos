SUMMARY = "Documentation for texlive-pdflscape"
DESCRIPTION = "This package includes the documentation for texlive-pdflscape"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64851"

RPM_NAME = "texlive-pdflscape-doc-2023.201.0.0.13svn64851-51.1.noarch.rpm"
RPM_HASH = "173aab60359a12bd2dbda2a2052ae8ffe9806168361edf039d86d4a1fc353945e486f3bb8237a7769cf687b649cfd5bed09b710defe38db6f8467f55ceff1e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflscape-doc"
RDEPENDS:${PN} += ""

inherit rpm
