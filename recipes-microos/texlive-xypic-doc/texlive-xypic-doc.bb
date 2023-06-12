SUMMARY = "Documentation for texlive-xypic"
DESCRIPTION = "This package includes the documentation for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8.9svn61719"

RPM_NAME = "texlive-xypic-doc-2023.201.3.8.9svn61719-52.1.noarch.rpm"
RPM_HASH = "9f14c2c35dfe743fe2ee543aa27985b5d494988952f404c170350b5d123153e34e296ae80b9dc65570b7257bdb78fb63254f083cf10a956b27ff946ae2cf6bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xypic-doc:en) \
texlive-xypic-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
