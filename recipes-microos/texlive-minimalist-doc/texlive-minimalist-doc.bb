SUMMARY = "Documentation for texlive-minimalist"
DESCRIPTION = "This package includes the documentation for texlive-minimalist"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66434"

RPM_NAME = "texlive-minimalist-doc-2023.201.svn66434-54.1.noarch.rpm"
RPM_HASH = "8a257409f22bafaaefeb6f9cf97d55aed40c1fe98f1b41e4d288882c2890eabbe0ae2b0009a8ae3b5907b23e244eca95b8ffaa75df4866959930d3e234ef8ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minimalist-doc"
RDEPENDS:${PN} += ""

inherit rpm
