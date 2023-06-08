SUMMARY = "Documentation for texlive-iso10303"
DESCRIPTION = "This package includes the documentation for texlive-iso10303"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-iso10303-doc-2023.201.1.5svn15878-55.1.noarch.rpm"
RPM_HASH = "84d03350dc33b7f4badf5e320f728af8243ea1835cddf6625c9034f4b29f47f958c9940b37bcd3b9f2cff06910339f4eff8724d3c31224a1d3f04212cd3b2d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso10303-doc"
RDEPENDS:${PN} += ""

inherit rpm
