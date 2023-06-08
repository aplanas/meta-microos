SUMMARY = "Documentation for gitslave"
DESCRIPTION = "This package provides documentation and help files for gitslave."
LICENSE = "SUSE-Gitslave"

PV = "2.0.2"

RPM_NAME = "gitslave-doc-2.0.2-9.17.noarch.rpm"
RPM_HASH = "9b54f74fe6b6b2804e032a52cd61831eaa9d3c0954ac5a3626cf45f281c43aa3260a927063ef688757d30c078e8c525d842857ff7b18554a53d57f35f9658ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gitslave-doc"
RDEPENDS:${PN} += ""

inherit rpm
