SUMMARY = "Documentation for texlive-calculation"
DESCRIPTION = "This package includes the documentation for texlive-calculation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35973"

RPM_NAME = "texlive-calculation-doc-2023.201.1.0svn35973-52.1.noarch.rpm"
RPM_HASH = "32b2011c128ca3f37554fd215dada2ad61567d738192cbf4448051c526207a04e3e180089269e069f7a025ed1f8b999b431947b35d2c49aa0f2d7378fa34cb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculation-doc"
RDEPENDS:${PN} += ""

inherit rpm
