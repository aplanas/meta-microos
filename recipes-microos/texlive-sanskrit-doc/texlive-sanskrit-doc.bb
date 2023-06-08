SUMMARY = "Documentation for texlive-sanskrit"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.4svn64502"

RPM_NAME = "texlive-sanskrit-doc-2023.201.2.2.4svn64502-53.1.noarch.rpm"
RPM_HASH = "38b05edd11430997ae21dd3600d5c6eeeb5193eec5b83c2884d70d0fe838fd9dc5855b3cfdc9bd61c43fc7e53f3ff0766960288b947e7a8a05045c2a86d72f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
