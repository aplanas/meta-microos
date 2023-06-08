SUMMARY = "Documentation for texlive-fnpara"
DESCRIPTION = "This package includes the documentation for texlive-fnpara"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25607"

RPM_NAME = "texlive-fnpara-doc-2023.201.svn25607-52.1.noarch.rpm"
RPM_HASH = "91169ab74989b781804bd52bafe56debd775012c0eb39c0876649f6cd67e11119b2733e71c64301602f0e964a2cf4f0b14342271946d917222178d7dec2b0433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpara-doc"
RDEPENDS:${PN} += ""

inherit rpm
