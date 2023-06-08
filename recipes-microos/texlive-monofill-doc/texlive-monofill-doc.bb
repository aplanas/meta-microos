SUMMARY = "Documentation for texlive-monofill"
DESCRIPTION = "This package includes the documentation for texlive-monofill"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28140"

RPM_NAME = "texlive-monofill-doc-2023.201.0.0.2svn28140-54.1.noarch.rpm"
RPM_HASH = "beea5d557750f12497a01cacb862b61e622acd23c10ead18c7a8464c0b7c2614ac8830e9c17d892f03cd6d279841c7b315448d1ee0794cee0e6dce42a2c39918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-monofill-doc"
RDEPENDS:${PN} += ""

inherit rpm
