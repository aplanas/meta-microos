SUMMARY = "Documentation for texlive-versions"
DESCRIPTION = "This package includes the documentation for texlive-versions"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.55svn21921"

RPM_NAME = "texlive-versions-doc-2023.201.0.0.55svn21921-53.1.noarch.rpm"
RPM_HASH = "bb0675983cc2a36c2d95b87b27a3d3e444b9bd75d06de117d29ac646b80c48f8e05a71c89aad20e4388c106a3bc75082dc493c53c44e3619991ead87ca7ac3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versions-doc"
RDEPENDS:${PN} += ""

inherit rpm
