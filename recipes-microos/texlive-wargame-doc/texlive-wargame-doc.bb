SUMMARY = "Documentation for texlive-wargame"
DESCRIPTION = "This package includes the documentation for texlive-wargame"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn64797"

RPM_NAME = "texlive-wargame-doc-2023.201.0.0.3.2svn64797-53.1.noarch.rpm"
RPM_HASH = "b44a7629526ba8e83e4494c09c0154538ae4d4ce869ad2aae96b758fdb6a1d0c3421e53d077c695bb9e14b7e8e224f32a379e4749158edae8deb200e3917ae08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wargame-doc"
RDEPENDS:${PN} += ""

inherit rpm
