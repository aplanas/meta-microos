SUMMARY = "Documentation for texlive-exercisepoints"
DESCRIPTION = "This package includes the documentation for texlive-exercisepoints"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.3svn49590"

RPM_NAME = "texlive-exercisepoints-doc-2023.201.1.2.3svn49590-52.1.noarch.rpm"
RPM_HASH = "79ab60934ca855f978a4530762c273d0cfe993daa53571b03ae267118a27d3a4d8a69cd604642a4ca2d6063907b8ade15133dd6834c83a93fd6795335a526158"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exercisepoints-doc"
RDEPENDS:${PN} += ""

inherit rpm
