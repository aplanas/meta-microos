SUMMARY = "Documentation for texlive-milsymb"
DESCRIPTION = "This package includes the documentation for texlive-milsymb"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn54361"

RPM_NAME = "texlive-milsymb-doc-2023.201.1.02svn54361-54.1.noarch.rpm"
RPM_HASH = "7cb62ddf30bb1376fff42a6bffd79d4346afdec2bc94f26dd88a2425d36616158d9e36e7f3152b70962bce0ca5caa9a943ce988c7a8d0bd64caf7f7a6d83252c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-milsymb-doc"
RDEPENDS:${PN} += ""

inherit rpm
