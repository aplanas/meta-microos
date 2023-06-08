SUMMARY = "Add reference-page-list to bibliography-items"
DESCRIPTION = "The package does its job without using the indexing facilities, \
and needs no special \\cite-replacement package."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn47407"

RPM_NAME = "texlive-citeref-2023.201.1.1svn47407-53.1.noarch.rpm"
RPM_HASH = "0c574b8c4af9b16d86795a4112a8e5dd6e12999853159aa8afcc67974e3501ed41f5471abf5ac671b71a4684f21ccabef77d4fb5d449cab7b3a2d1c0dfab4d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(citeref.sty) texlive-citeref"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
