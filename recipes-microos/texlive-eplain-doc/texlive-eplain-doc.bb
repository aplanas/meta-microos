SUMMARY = "Documentation for texlive-eplain"
DESCRIPTION = "This package includes the documentation for texlive-eplain"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.13svn64721"

RPM_NAME = "texlive-eplain-doc-2023.201.3.13svn64721-53.1.noarch.rpm"
RPM_HASH = "de7b6e9885b8c046e092701c664ee402eb979f795673a3eadd450107837272a9d9507ac27c994007c5a5c6c6f67546765cba42e0bcdc0fa68d0a4ff9700a5d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(eplain.1) texlive-eplain-doc"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk"

inherit rpm
