SUMMARY = "Documentation for texlive-iitem"
DESCRIPTION = "This package includes the documentation for texlive-iitem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29613"

RPM_NAME = "texlive-iitem-doc-2023.201.1.0svn29613-52.1.noarch.rpm"
RPM_HASH = "1a770a01dd985906a07664994f110aca450be969046fe603029ab5937d5fa2ccdebed68338d38d1139352449a99ecb27b8a782de5369fa32d34b0f52ddee42f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iitem-doc"
RDEPENDS:${PN} += ""

inherit rpm
