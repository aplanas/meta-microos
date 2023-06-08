SUMMARY = "Documentation for texlive-pst-cie"
DESCRIPTION = "This package includes the documentation for texlive-pst-cie"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06bsvn60959"

RPM_NAME = "texlive-pst-cie-doc-2023.201.1.06bsvn60959-52.1.noarch.rpm"
RPM_HASH = "202f07eb7e18d44cc604f4b2d8e8a3e6692b115fbe2bf91dd47d3ee5805c45ab7751f9b9c7f24fe6b3913754224fb7c73470d9ad36807d1a1b6fa3e09e2c2fb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-cie-doc"
RDEPENDS:${PN} += ""

inherit rpm
