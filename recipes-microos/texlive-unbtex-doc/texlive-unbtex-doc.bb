SUMMARY = "Documentation for texlive-unbtex"
DESCRIPTION = "This package includes the documentation for texlive-unbtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64634"

RPM_NAME = "texlive-unbtex-doc-2023.201.1.2svn64634-53.1.noarch.rpm"
RPM_HASH = "bbcff7c7deec691e5d99651a9638d2c6186e06be74eb85d81761a550be7781163e8cc22d473b6cd17b4315b9b2160724f9bb788aaddec0df275638391324d29e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-unbtex-doc:pt_BR) \
texlive-unbtex-doc"
RDEPENDS:${PN} += ""

inherit rpm
