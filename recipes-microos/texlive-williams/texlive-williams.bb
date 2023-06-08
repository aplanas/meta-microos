SUMMARY = "Miscellaneous macros by Peter Williams"
DESCRIPTION = "The bundle provides two packages: antree, which provides macros \
for annotated node trees, and toklist, which is an \
implementation of Knuth's token list macros, to be found on \
pp.378-379 of the TeXbook."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-williams-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "7f4825e4db38c05885b89d46f8ab4dbdbfe24ad9571d57670e65ba34f80759b20086cced559913381f41762321defcafa889f20da713b250b22471141fb5c94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(antree.sty) tex(toklist.sty) texlive-williams"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(eepic.sty) tex(epic.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
