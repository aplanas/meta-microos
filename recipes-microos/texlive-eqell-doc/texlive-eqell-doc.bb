SUMMARY = "Documentation for texlive-eqell"
DESCRIPTION = "This package includes the documentation for texlive-eqell"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22931"

RPM_NAME = "texlive-eqell-doc-2023.201.svn22931-53.1.noarch.rpm"
RPM_HASH = "cf9d67771af132f73e78c0b538c80e98d0b7f91648b7d6b4f4f7969b0821b5a07d5648beb880bb534e19003d998e63f9d9b5de188839a30c7719938fb8aaadae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqell-doc"
RDEPENDS:${PN} += ""

inherit rpm
