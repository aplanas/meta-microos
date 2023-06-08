SUMMARY = "Documentation for texlive-mdframed"
DESCRIPTION = "This package includes the documentation for texlive-mdframed"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9bsvn31075"

RPM_NAME = "texlive-mdframed-doc-2023.201.1.9bsvn31075-52.1.noarch.rpm"
RPM_HASH = "816d28fed5d98cc5d24a4be8608a7d0783feef58bdcbd6a35da4c7a1a71b078fb6df73325ed8dfbd2814b20a6a93c36325104ce0f57bdc81073fbfdc4434d58d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdframed-doc"
RDEPENDS:${PN} += ""

inherit rpm
