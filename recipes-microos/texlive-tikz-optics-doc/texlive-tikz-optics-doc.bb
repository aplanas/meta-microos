SUMMARY = "Documentation for texlive-tikz-optics"
DESCRIPTION = "This package includes the documentation for texlive-tikz-optics"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-doc-2023.201.0.0.2.3svn62977-52.1.noarch.rpm"
RPM_HASH = "63b0b75b641d9509e23ff80d20dbd19e10a3056676908d9d674a67b4ff048ff69272ad48073324686ab13df808c0ed1045f4679000c70aca5fc1a08ff11d64ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tikz-optics-doc:fr) texlive-tikz-optics-doc"
RDEPENDS:${PN} += ""

inherit rpm
