SUMMARY = "ConTeXt scheme"
DESCRIPTION = "This is the TeX Live scheme for installing ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59636"

RPM_NAME = "texlive-scheme-context-2023.208.svn59636-58.1.noarch.rpm"
RPM_HASH = "5feb306663d4169f27c9c93a485b2894592a9d16201f8948b465827e086e9e71ead18d208b736e510b58a2ee50dc3e0be12e2bb080badabe86df7e05be246a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(context) texlive-scheme-context"
RDEPENDS:${PN} += "texlive-antt texlive-asana-math texlive-ccicons texlive-collection-context texlive-collection-metapost texlive-dejavu texlive-eulervm texlive-gentium-tug texlive-iwona texlive-kurier texlive-ly1 texlive-manfnt-font texlive-marvosym texlive-mflogo-font texlive-poltawski texlive-pxfonts texlive-tex-gyre texlive-tex-gyre-math texlive-txfonts texlive-wasy texlive-xits"

inherit rpm
