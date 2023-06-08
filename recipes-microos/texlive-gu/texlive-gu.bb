SUMMARY = "Typeset crystallographic group-subgroup-schemes"
DESCRIPTION = "The package simplifies typesetting of simple crystallographic \
group-subgroup-schemes in the Barnighausen formalism. It \
defines a new environment stammbaum, wherein all elements of \
the scheme are defined. Afterwards all necessary dimensions are \
calculated and the scheme is drawn. Currently two steps of \
symmetry reduction are supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gu-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "1db2cad16525616b5ed7fcf4dc9e50ad26077aff24fc13ef78c2a98d8538458767222b1c49949ab14e67d5743d08b7b4dec51b79f5e39bb84853bb70d29c4a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gu.sty) texlive-gu"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(array.sty) tex(calc.sty) tex(fp.sty) tex(ifthen.sty) tex(pict2e.sty) tex(tabularx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
