SUMMARY = "Documentation for texlive-mxedruli"
DESCRIPTION = "This package includes the documentation for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-doc-2023.201.3.3csvn30021-54.1.noarch.rpm"
RPM_HASH = "c30f18945957264bb1b60f15ec17cc658b79638a34fad0e77d91668945db93e479a7f8ab39123951ff6191441a10692a3422f5d5c222614f0baffe61c0af4b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mxedruli-doc"
RDEPENDS:${PN} += ""

inherit rpm
