SUMMARY = "Documentation for texlive-makelabels"
DESCRIPTION = "This package includes the documentation for texlive-makelabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60255"

RPM_NAME = "texlive-makelabels-doc-2023.201.1.0svn60255-52.1.noarch.rpm"
RPM_HASH = "2eb6e4ea27f063e0e69a36f6e6949d690936ed410650872e55eaada3e5fdeaf73d2082e578df97689ed323ca6bdb2033de2324fb9352e6c6142653a63b97b778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels-doc"
RDEPENDS:${PN} += ""

inherit rpm
