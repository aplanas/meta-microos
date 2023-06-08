SUMMARY = "Documentation for texlive-dbshow"
DESCRIPTION = "This package includes the documentation for texlive-dbshow"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn61634"

RPM_NAME = "texlive-dbshow-doc-2023.201.1.5svn61634-52.1.noarch.rpm"
RPM_HASH = "fd5a8f8add24ef3a1caaddd730039b93aa1a3fdeba582d6eddcd16069174a766908909de2e924b1b832f6a9035fc5eeff9c7af01fe3db08aab4b7db6fa4c73c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) locale(texlive-dbshow-doc:zh texlive-dbshow-doc"
RDEPENDS:${PN} += ""

inherit rpm
