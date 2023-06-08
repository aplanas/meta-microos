SUMMARY = "Documentation for texlive-kantlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kantlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8asvn51727"

RPM_NAME = "texlive-kantlipsum-doc-2023.201.0.0.8asvn51727-55.1.noarch.rpm"
RPM_HASH = "da1af957fba1fafde36de13a026164bfbeb50e8bb3b378298517e332a43bbe7df2097580dc7acae53b02c02bf649da46f85f6cec1b05a4c7bf80fefe2c560e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kantlipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
