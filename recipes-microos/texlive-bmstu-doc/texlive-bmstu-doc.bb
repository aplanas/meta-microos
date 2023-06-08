SUMMARY = "Documentation for texlive-bmstu"
DESCRIPTION = "This package includes the documentation for texlive-bmstu"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn65897"

RPM_NAME = "texlive-bmstu-doc-2023.201.2.0.0svn65897-52.1.noarch.rpm"
RPM_HASH = "9d14f91790f22c4496cceeb31cfbc4235762674a547e311e37a9e376fd3cc64e351730b69a007bba0d660b4f5b1f5c84af7c127db1ea4e30a0e2de3a5e90ae70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bmstu-doc"
RDEPENDS:${PN} += ""

inherit rpm
