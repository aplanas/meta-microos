SUMMARY = "Documentation for texlive-chemstyle"
DESCRIPTION = "This package includes the documentation for texlive-chemstyle"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0msvn31096"

RPM_NAME = "texlive-chemstyle-doc-2023.201.2.0msvn31096-53.1.noarch.rpm"
RPM_HASH = "46f151d1cc2fde58fbe77e3430ef5482a0e483f0d93be93900fbef3e3af568363b008d70cce551a28ca4b6df413e4d07151d18669223a52d6ace6d9789d6779f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemstyle-doc"
RDEPENDS:${PN} += ""

inherit rpm
