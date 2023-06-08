SUMMARY = "Documentation for texlive-xfakebold"
DESCRIPTION = "This package includes the documentation for texlive-xfakebold"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-doc-2023.201.0.0.08svn55654-52.1.noarch.rpm"
RPM_HASH = "a46cac300fd814a6c215545181f342fad7875e1ee3a24cd077b0da28d01e7e58a8424e05d3ec379c9baa40cada49877f768cde82b1ed418f3435c214a5d7cec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfakebold-doc"
RDEPENDS:${PN} += ""

inherit rpm
