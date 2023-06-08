SUMMARY = "Documentation for texlive-tram"
DESCRIPTION = "This package includes the documentation for texlive-tram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn29803"

RPM_NAME = "texlive-tram-doc-2023.201.0.0.2svn29803-52.1.noarch.rpm"
RPM_HASH = "26c5912a92a929bf0207d3fb9d3fd5d6c46068bc0121eae29b3f88fc54c3d12d46d570bb8b76932cc9ea6e296d08d25debac71ffeaae590f1ead4ccd5211d5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tram-doc"
RDEPENDS:${PN} += ""

inherit rpm
