SUMMARY = "Documentation for texlive-context-rst"
DESCRIPTION = "This package includes the documentation for texlive-context-rst"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-rst-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "02c32eb870e83ae058688b7f5f1a6179311fd466ed86cdfe4945d32ff55b85dffffbf7458359c3b535a5aa2ca1789c9047ce190cabe2b68da8589318ed65b956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-rst-doc"
RDEPENDS:${PN} += ""

inherit rpm
