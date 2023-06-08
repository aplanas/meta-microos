SUMMARY = "Documentation for texlive-afm2pl"
DESCRIPTION = "This package includes the documentation for texlive-afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-afm2pl-doc-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "3033aa0a810bf7a7eb2f3a4a7dcdad5ed7fa720e68fa774fb8c66a89fbdefd7d1518f48fdc1e284755a2df4b6a25bbe3451df32fcbb7d2d91740dd7c1f35b89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(afm2pl.1) texlive-afm2pl-doc"
RDEPENDS:${PN} += ""

inherit rpm
