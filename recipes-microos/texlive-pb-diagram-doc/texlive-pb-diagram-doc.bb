SUMMARY = "Documentation for texlive-pb-diagram"
DESCRIPTION = "This package includes the documentation for texlive-pb-diagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-doc-2023.201.5.0svn15878-51.1.noarch.rpm"
RPM_HASH = "193f9274b2f6406deedc345d353af661f81401dbaed4346cad13bf884b30a474d00153b724a629dcde32796a45eada3dfd93128a255301deb02f860ebc4b5183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pb-diagram-doc"
RDEPENDS:${PN} += ""

inherit rpm
