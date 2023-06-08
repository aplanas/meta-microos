SUMMARY = "Documentation for texlive-iwona"
DESCRIPTION = "This package includes the documentation for texlive-iwona"
LICENSE = "LPPL-1.3c"

PV = "2023.201.0.0.995bsvn19611"

RPM_NAME = "texlive-iwona-doc-2023.201.0.0.995bsvn19611-55.1.noarch.rpm"
RPM_HASH = "3963095074881fc76537feae78fcd16fb11cf537100a637caeaaa88430b36710d3fee3a607dc05c3ceebc13cb051281cb6085355d71306ba9ba311d23ab1cafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iwona-doc"
RDEPENDS:${PN} += ""

inherit rpm
