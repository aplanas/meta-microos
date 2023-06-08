SUMMARY = "Documentation for texlive-cyber"
DESCRIPTION = "This package includes the documentation for texlive-cyber"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.2svn46776"

RPM_NAME = "texlive-cyber-doc-2023.204.2.2svn46776-54.1.noarch.rpm"
RPM_HASH = "5d7b51870e031eaa49727ea57bbc5e98ecf53b0bde426b390898dff357cee7f79c90e16135537dcac1057fcdf72006256f75aebfe4968ef3831fa9911fb865ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyber-doc"
RDEPENDS:${PN} += ""

inherit rpm
