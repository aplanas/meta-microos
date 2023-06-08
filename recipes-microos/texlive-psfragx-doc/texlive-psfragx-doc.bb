SUMMARY = "Documentation for texlive-psfragx"
DESCRIPTION = "This package includes the documentation for texlive-psfragx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn26243"

RPM_NAME = "texlive-psfragx-doc-2023.201.1.1svn26243-52.1.noarch.rpm"
RPM_HASH = "f42d755b1a52d7126c7029f6c377e04ee54cd72b538f5e48d41c22d128198f038761ed8d601cd0ff7d4483e3821467caf541812c2b55d789bd36f464cfa910aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfragx-doc"
RDEPENDS:${PN} += ""

inherit rpm
