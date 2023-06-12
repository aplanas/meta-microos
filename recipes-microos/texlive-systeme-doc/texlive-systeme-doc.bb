SUMMARY = "Documentation for texlive-systeme"
DESCRIPTION = "This package includes the documentation for texlive-systeme"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.34svn55015"

RPM_NAME = "texlive-systeme-doc-2023.201.0.0.34svn55015-57.1.noarch.rpm"
RPM_HASH = "efb8d2a9ea5db947f4ebcc1b7717523f9f6bdd3edc35f099cbf6ea9c37c3d0d2e25a5fa30a2191b62dd19ff8d92918c8e33f25c3ab347881d0a232f0eca6e23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-systeme-doc:fr) \
texlive-systeme-doc"
RDEPENDS:${PN} += ""

inherit rpm
