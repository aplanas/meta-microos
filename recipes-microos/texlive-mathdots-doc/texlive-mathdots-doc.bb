SUMMARY = "Documentation for texlive-mathdots"
DESCRIPTION = "This package includes the documentation for texlive-mathdots"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn34301"

RPM_NAME = "texlive-mathdots-doc-2023.201.0.0.9svn34301-52.1.noarch.rpm"
RPM_HASH = "4b9a94df4a991788ff7200d1757414bf37c65b1d73dcba8a178d583a458988fd739fb121d82eff85b813f85d560d7b5cb94bb354bb71b8d9f795e3847612f765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdots-doc"
RDEPENDS:${PN} += ""

inherit rpm
