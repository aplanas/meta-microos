SUMMARY = "Documentation for texlive-muthesis"
DESCRIPTION = "This package includes the documentation for texlive-muthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23861"

RPM_NAME = "texlive-muthesis-doc-2023.201.svn23861-54.1.noarch.rpm"
RPM_HASH = "00c0f8133bc19ec0d52d80939fd88ee6b0cf048e81454a2e043795c038346a23a7967af93966baab5c50ef6a35434d6f67d427441c3dac34587d242c9cb4e9fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
