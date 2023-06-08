SUMMARY = "Documentation for texlive-figbib"
DESCRIPTION = "This package includes the documentation for texlive-figbib"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19388"

RPM_NAME = "texlive-figbib-doc-2023.201.svn19388-52.1.noarch.rpm"
RPM_HASH = "5356668ec54d36c2bda7fee7754e158b94142bef0eed896566d55b0cc576746a17ae84b6f570c9b33623c7a06c37e9a2de9bcf18586dc321994e797988944112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbib-doc"
RDEPENDS:${PN} += ""

inherit rpm
