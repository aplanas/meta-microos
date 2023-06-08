SUMMARY = "Documentation for texlive-drawstack"
DESCRIPTION = "This package includes the documentation for texlive-drawstack"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28582"

RPM_NAME = "texlive-drawstack-doc-2023.201.svn28582-52.1.noarch.rpm"
RPM_HASH = "9e4664caf6362b56d14493fbe3d556fbb4208e00c946a566364181ebd1e2a05b1782f08f5e40e0819cc0b5545a3039881aefcbd079c85ac647a3513ba85f2427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawstack-doc"
RDEPENDS:${PN} += ""

inherit rpm
