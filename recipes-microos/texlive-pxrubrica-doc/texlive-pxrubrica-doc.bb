SUMMARY = "Documentation for texlive-pxrubrica"
DESCRIPTION = "This package includes the documentation for texlive-pxrubrica"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-doc-2023.201.1.3esvn66298-53.1.noarch.rpm"
RPM_HASH = "bef501c247d7f2bb9b04c68b337a33c602d51d5f791b4a833b689370315d4bc7270d947375d7ddad5884d20472e5cdbfa0f93e84da53027c6a2fdcf975ea1d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pxrubrica-doc:ja) \
texlive-pxrubrica-doc"
RDEPENDS:${PN} += ""

inherit rpm
