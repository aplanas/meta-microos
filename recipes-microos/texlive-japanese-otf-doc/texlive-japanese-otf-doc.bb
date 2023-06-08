SUMMARY = "Documentation for texlive-japanese-otf"
DESCRIPTION = "This package includes the documentation for texlive-japanese-otf"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66091"

RPM_NAME = "texlive-japanese-otf-doc-2023.201.svn66091-55.1.noarch.rpm"
RPM_HASH = "bcbd50f97297c6ad8f9f46ee7d2048ebcdc7ff1f6f19bdcb76f6cbcdcd20676a49315e5f616cdf124f9eb6cd593e568e3fdf972b718678cee98037b1c64b0865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-japanese-otf-doc:en;ja) texlive-japanese-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
