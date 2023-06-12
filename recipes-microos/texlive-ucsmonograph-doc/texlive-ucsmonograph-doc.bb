SUMMARY = "Documentation for texlive-ucsmonograph"
DESCRIPTION = "This package includes the documentation for texlive-ucsmonograph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.0svn52698"

RPM_NAME = "texlive-ucsmonograph-doc-2023.201.1.3.0svn52698-53.1.noarch.rpm"
RPM_HASH = "7e34d3e361ef531cbf2f1c1d9af21a48fda11b86437f4a6ad85f850c7a7b1b190d9b36b614256af8c9954cbcfad7f923aeaf54b1baebdd72ccf9d5798edca8a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ucsmonograph-doc:pt_BR) \
texlive-ucsmonograph-doc"
RDEPENDS:${PN} += ""

inherit rpm
