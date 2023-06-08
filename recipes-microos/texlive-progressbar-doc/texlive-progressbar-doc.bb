SUMMARY = "Documentation for texlive-progressbar"
DESCRIPTION = "This package includes the documentation for texlive-progressbar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-doc-2023.201.1.0b_4svn33822-52.1.noarch.rpm"
RPM_HASH = "f5fa333772f569a1e3df087fc99b4e32398cbde6e21f82201b3a7c647ae0e0653b64a3b2aa3eeba635731b7c57c9de361c93fb8a6423e74cccf831d9bcc3d2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progressbar-doc"
RDEPENDS:${PN} += ""

inherit rpm
