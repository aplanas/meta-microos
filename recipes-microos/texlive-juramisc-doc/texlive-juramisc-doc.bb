SUMMARY = "Documentation for texlive-juramisc"
DESCRIPTION = "This package includes the documentation for texlive-juramisc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-juramisc-doc-2023.201.0.0.91svn15878-55.1.noarch.rpm"
RPM_HASH = "742e58015532babc92d74ebd29d29fa5b041881b4417cce2ce8225b4383925ed20396b8d2158593081e550e2e4c19c147356ce56b5010dca96138ba44ce4cc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-juramisc-doc:de) texlive-juramisc-doc"
RDEPENDS:${PN} += ""

inherit rpm
