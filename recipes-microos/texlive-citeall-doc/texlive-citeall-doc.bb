SUMMARY = "Documentation for texlive-citeall"
DESCRIPTION = "This package includes the documentation for texlive-citeall"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn45975"

RPM_NAME = "texlive-citeall-doc-2023.201.1.4svn45975-53.1.noarch.rpm"
RPM_HASH = "629631b5a71e842e4c8e4e7b49e8c42429dc50df8ea755d331679ca2ef06b08bde23e26b5a418dca296c211d4947963cd4123e7ba2ada965d17cf823eb618d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-citeall-doc"
RDEPENDS:${PN} += ""

inherit rpm
