SUMMARY = "Documentation for texlive-latexmk"
DESCRIPTION = "This package includes the documentation for texlive-latexmk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.79svn65485"

RPM_NAME = "texlive-latexmk-doc-2023.201.4.79svn65485-54.1.noarch.rpm"
RPM_HASH = "05b398316eb045b0b4c6ad990a2a2526b4ee4193d70c45e471ef6dfcb9f04fb635dab74c9eb6eaa5850adae874388bb199d8d56a82ee20900fd4c255ea235028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(latexmk.1) texlive-latexmk-doc"
RDEPENDS:${PN} += "/bin/csh /bin/sh"

inherit rpm
