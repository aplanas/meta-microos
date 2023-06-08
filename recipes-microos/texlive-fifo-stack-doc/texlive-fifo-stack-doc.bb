SUMMARY = "Documentation for texlive-fifo-stack"
DESCRIPTION = "This package includes the documentation for texlive-fifo-stack"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-doc-2023.201.1.0svn33288-52.1.noarch.rpm"
RPM_HASH = "e465a94b865334845ff4b72b7e0c83626dcb73b4668255a143530723b56ef51b9e0b1f5e70216317397bc711e0725ed5dbd5ca10a813bab2d2d56a169148dcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fifo-stack-doc"
RDEPENDS:${PN} += ""

inherit rpm
