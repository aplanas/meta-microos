SUMMARY = "Documentation for texlive-langnames"
DESCRIPTION = "This package includes the documentation for texlive-langnames"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn65502"

RPM_NAME = "texlive-langnames-doc-2023.201.2.1svn65502-55.1.noarch.rpm"
RPM_HASH = "681b331f6d4d6497263d9d68def18ab300781c633d15559683040f002009e66fc1ec376fdda169b82b1e5a700b75c57e7c8580e5fea2829697a10fb35a127fe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langnames-doc"
RDEPENDS:${PN} += ""

inherit rpm
