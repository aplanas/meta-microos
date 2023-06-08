SUMMARY = "Documentation for texlive-lettre"
DESCRIPTION = "This package includes the documentation for texlive-lettre"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.002svn54722"

RPM_NAME = "texlive-lettre-doc-2023.201.3.002svn54722-54.1.noarch.rpm"
RPM_HASH = "e627e987b024b2e1397ef90400a929b701977d14719ea9e67ea445015e958231282a9f0bd88de85bf23cdb686b0c9644502f174122993e203018b68112655cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-lettre-doc:fr) texlive-lettre-doc"
RDEPENDS:${PN} += ""

inherit rpm
