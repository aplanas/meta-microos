SUMMARY = "Examples from the KOMA-Script book"
DESCRIPTION = "This package contains some examples from the 6th edition of the \
book >>KOMA-Script<<, >>Eine Sammlung von Klassen und Paketen \
fur LaTeX2e<< by Markus Kohm, published by Lehmanns Media. \
There are no further descriptions of these examples."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63833"

RPM_NAME = "texlive-koma-script-examples-2023.201.svn63833-55.1.noarch.rpm"
RPM_HASH = "6968fcee97db57b059585499174be5ec4e6d91101dab9608db07362534c266dcb467450d8ea269a84b3487041ca91280adf011ff262abe9f99c992778219f851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-examples"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
