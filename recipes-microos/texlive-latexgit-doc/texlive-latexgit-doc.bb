SUMMARY = "Documentation for texlive-latexgit"
DESCRIPTION = "This package includes the documentation for texlive-latexgit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn54811"

RPM_NAME = "texlive-latexgit-doc-2023.201.svn54811-54.1.noarch.rpm"
RPM_HASH = "c61fbda38f92b473bf0c9de54ce96438132d79b2748fdae4a02a0ead28a12261c7186b4f9a82cd629afa1956d7bfe90ca249126f0df212510503a1ae7bb1759b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexgit-doc"
RDEPENDS:${PN} += ""

inherit rpm
