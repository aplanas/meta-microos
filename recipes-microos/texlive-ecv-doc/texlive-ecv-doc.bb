SUMMARY = "Documentation for texlive-ecv"
DESCRIPTION = "This package includes the documentation for texlive-ecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn24928"

RPM_NAME = "texlive-ecv-doc-2023.201.0.0.3svn24928-53.1.noarch.rpm"
RPM_HASH = "3c6c0b1873b70a0dde245a8bd6e69aa7628b7456abb830b2c1d600dc10f4e1c9e24a8fdc4fbc50e2283dac8a388c240919a86bf659b0baaafcdf7cb873297a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-ecv-doc:de;en) texlive-ecv-doc"
RDEPENDS:${PN} += ""

inherit rpm
