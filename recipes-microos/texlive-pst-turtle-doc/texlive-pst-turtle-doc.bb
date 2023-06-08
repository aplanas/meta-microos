SUMMARY = "Documentation for texlive-pst-turtle"
DESCRIPTION = "This package includes the documentation for texlive-pst-turtle"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn52261"

RPM_NAME = "texlive-pst-turtle-doc-2023.201.0.0.02svn52261-53.1.noarch.rpm"
RPM_HASH = "1e00d1cbe66eac496406ad38ce10a9d7fcf26c2bc0735e85064006b72b2ac9eb69fc4f5c59ddd3dc5eddd848b2984716ec7151f6a960f3dc2448ad2430dae80c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-turtle-doc"
RDEPENDS:${PN} += ""

inherit rpm
