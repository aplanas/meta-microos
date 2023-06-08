SUMMARY = "Documentation for texlive-nicefilelist"
DESCRIPTION = "This package includes the documentation for texlive-nicefilelist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn65842"

RPM_NAME = "texlive-nicefilelist-doc-2023.201.0.0.9bsvn65842-54.1.noarch.rpm"
RPM_HASH = "bebf7badb7456da79f849be96986ba3ba806871687cb2b08939e83de34d4fef066a62cd2b60d55a0d7650bf86af1c9ecfcf6782a96172c75bd97175f14c535ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicefilelist-doc"
RDEPENDS:${PN} += ""

inherit rpm
