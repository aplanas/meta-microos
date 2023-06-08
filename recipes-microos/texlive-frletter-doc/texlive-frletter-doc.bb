SUMMARY = "Documentation for texlive-frletter"
DESCRIPTION = "This package includes the documentation for texlive-frletter"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-frletter-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "887e9fe5247a6db89bfbc7c8a7abb0968b0ff8b320546acaeda877e1007ba5c0b28a5bb65c882386a37dbb2b37e78ebca41db025f0a5c37598ea4afdc82ba678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frletter-doc"
RDEPENDS:${PN} += ""

inherit rpm
