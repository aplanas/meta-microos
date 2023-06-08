SUMMARY = "Documentation for texlive-othelloboard"
DESCRIPTION = "This package includes the documentation for texlive-othelloboard"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23714"

RPM_NAME = "texlive-othelloboard-doc-2023.201.1.2svn23714-54.1.noarch.rpm"
RPM_HASH = "45736aa20731815065d7d4b565b6449d07c3656878f4639680cf78bcf7e6e397e72620859158f7c2fb09635a7675041b6abbd5c24b3148cafee03b7945cae483"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othelloboard-doc"
RDEPENDS:${PN} += ""

inherit rpm
