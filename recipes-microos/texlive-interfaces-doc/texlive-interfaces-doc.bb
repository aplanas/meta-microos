SUMMARY = "Documentation for texlive-interfaces"
DESCRIPTION = "This package includes the documentation for texlive-interfaces"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn21474"

RPM_NAME = "texlive-interfaces-doc-2023.201.3.1svn21474-52.1.noarch.rpm"
RPM_HASH = "e26036efaffccf9d4792d05923acc1d68940e7a9a69d25fe1edc7c0bc62e376a05044c518d21c381a7fb0afef3bc510d80fa965d754bbe7ecc3651bb0ac2bf50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interfaces-doc"
RDEPENDS:${PN} += ""

inherit rpm
