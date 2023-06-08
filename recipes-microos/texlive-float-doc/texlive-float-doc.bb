SUMMARY = "Documentation for texlive-float"
DESCRIPTION = "This package includes the documentation for texlive-float"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn15878"

RPM_NAME = "texlive-float-doc-2023.201.1.3dsvn15878-52.1.noarch.rpm"
RPM_HASH = "74353b7043800e0de97cf8e99d7107de6a509c7e03409735bda6d83da438025371ef7a622f6440d841f3690cffc2bb589a1810e28b5207a01453aedc57c2c607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-float-doc"
RDEPENDS:${PN} += ""

inherit rpm
