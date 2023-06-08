SUMMARY = "Documentation for texlive-hitreport"
DESCRIPTION = "This package includes the documentation for texlive-hitreport"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-doc-2023.201.1.0.0svn58357-53.1.noarch.rpm"
RPM_HASH = "dcb24392b0cd13378ea4a9783be85f8abb0d4b44c5a4be9d2ac92455186ea3e5a8bfc8a197705571f6fa191009346e8049a4ac814e57f506501d50b11e57e434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hitreport-doc:zh) texlive-hitreport-doc"
RDEPENDS:${PN} += ""

inherit rpm
