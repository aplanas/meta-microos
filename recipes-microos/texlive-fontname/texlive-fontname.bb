SUMMARY = "Scheme for naming fonts in TeX"
DESCRIPTION = "The scheme for assigning names is described (in the \
documentation part of the package), and map files giving the \
relation between foundry name and 'TeX-name' are also provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64477"

RPM_NAME = "texlive-fontname-2023.201.svn64477-52.1.noarch.rpm"
RPM_HASH = "f055a77b0c47e8c055f2e10affe8623d5ce9e76700881e49c60c5a8847ecb5da400cadfe141bac24f9ff1d9284b8562805686123eb0769e9e73bf425db1f21d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(adobe.map) tex(apple.map) tex(bitstrea.map) tex(dtc.map) tex(itc.map) tex(linot-cd.map) tex(linotype-cd.map) tex(linotype.map) tex(monotype.map) tex(skey1250.map) tex(skey1555.map) tex(softkey-1250.map) tex(softkey-1555.map) tex(softkey.map) tex(special.map) tex(supplier.map) tex(texfonts.map) tex(typeface.map) tex(urw.map) tex(variant.map) tex(weight.map) tex(width.map) tex(yandy.map) texlive-fontname"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
