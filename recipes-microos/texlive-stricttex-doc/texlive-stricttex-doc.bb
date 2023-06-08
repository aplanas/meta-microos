SUMMARY = "Documentation for texlive-stricttex"
DESCRIPTION = "This package includes the documentation for texlive-stricttex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2betasvn56320"

RPM_NAME = "texlive-stricttex-doc-2023.201.0.0.2betasvn56320-57.1.noarch.rpm"
RPM_HASH = "5c24466e562f047dba8788159e020316426d155fdd06fcb22f99a3c271804fe58bfafde3c851c9eb28398bf65c3a3a1a144e5a3d96ac6a70e482cb59ebf0a75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stricttex-doc"
RDEPENDS:${PN} += ""

inherit rpm
