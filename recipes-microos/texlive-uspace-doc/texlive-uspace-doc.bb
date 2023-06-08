SUMMARY = "Documentation for texlive-uspace"
DESCRIPTION = "This package includes the documentation for texlive-uspace"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.05svn63123"

RPM_NAME = "texlive-uspace-doc-2023.201.0.0.05svn63123-53.1.noarch.rpm"
RPM_HASH = "645ce2e7e6f84e515f75452bd929a02d5b2f16ac121f7748beaf8dd201312039d313b2873b3f737596d13ac7999218bc491c5a5d549bdc610a01545e160a3d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspace-doc"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
