SUMMARY = "Documentation for texlive-chktex"
DESCRIPTION = "This package includes the documentation for texlive-chktex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7.8svn64797"

RPM_NAME = "texlive-chktex-doc-2023.201.1.7.8svn64797-53.1.noarch.rpm"
RPM_HASH = "01eefb74b1261b9bb85c4a58d0a2afa52cc6ad29457a4d6dba23dbb38aa3a4309068cc2fc5afb160c56255015487ba436bd1900368161b122268540901d37363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(chktex.1) man(chkweb.1) man(deweb.1) texlive-chktex-doc"
RDEPENDS:${PN} += ""

inherit rpm
