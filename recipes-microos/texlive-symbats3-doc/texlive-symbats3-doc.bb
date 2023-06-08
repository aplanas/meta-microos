SUMMARY = "Documentation for texlive-symbats3"
DESCRIPTION = "This package includes the documentation for texlive-symbats3"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63833"

RPM_NAME = "texlive-symbats3-doc-2023.201.svn63833-57.1.noarch.rpm"
RPM_HASH = "bee27bca7daabf4719b790533e62d472b9306a6c5729164c6011c9c95fa50d98129ef09d6ec6e37b8aec102b748a7cfa0efd0da92e5cb604cad8365ae0d20cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-symbats3-doc"
RDEPENDS:${PN} += ""

inherit rpm
