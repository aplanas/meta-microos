SUMMARY = "Documentation for texlive-hc"
DESCRIPTION = "This package includes the documentation for texlive-hc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-hc-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "7dff1bf26183415d1b4608abd77f3d5089fa1da77c4ef9f315429b9219df7f187a3680347eb771d519bb175c92137f4440f8730b0b480c599233149804c6083f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hc-doc"
RDEPENDS:${PN} += ""

inherit rpm
