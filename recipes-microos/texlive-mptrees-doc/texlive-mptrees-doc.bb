SUMMARY = "Documentation for texlive-mptrees"
DESCRIPTION = "This package includes the documentation for texlive-mptrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.21.11svn60929"

RPM_NAME = "texlive-mptrees-doc-2023.201.21.11svn60929-54.1.noarch.rpm"
RPM_HASH = "5da756a3a80c2d3949efc45ad153acea96de05b4f8be004b3e0f3dbee401e4fff2bc632b9e45f36081adf1f81d57d58041371e4d5998a0a75ef09bd05c41b535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mptrees-doc"
RDEPENDS:${PN} += ""

inherit rpm
