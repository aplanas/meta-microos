SUMMARY = "Documentation for texlive-orkhun"
DESCRIPTION = "This package includes the documentation for texlive-orkhun"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-orkhun-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "bbfb38b4c62316a5ed1d0a8010540fe9e2ab37b525e6919db7ac3374e270de91c395bb57e7525d76fe3ed2b195b2bde3afed71ac45e27dbef3344997e41cd160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orkhun-doc"
RDEPENDS:${PN} += ""

inherit rpm
