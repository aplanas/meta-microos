SUMMARY = "Documentation for texlive-apptools"
DESCRIPTION = "This package includes the documentation for texlive-apptools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28400"

RPM_NAME = "texlive-apptools-doc-2023.201.1.0svn28400-54.1.noarch.rpm"
RPM_HASH = "25899031511011c2e00666a891891599fee3f01257df7ce57de1b8dea048f2f34dd194283bf874c9048be9c587cfc67271ba1567b89325d068282e503382134d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apptools-doc"
RDEPENDS:${PN} += ""

inherit rpm
