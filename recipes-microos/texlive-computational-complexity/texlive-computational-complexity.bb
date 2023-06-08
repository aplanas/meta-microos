SUMMARY = "Class for the journal Computational Complexity"
DESCRIPTION = "The LaTeX2e class cc was written for the journal Computational \
Complexity, and it can also be used for a lot of other \
articles. You may like it since it contains a lot of features \
such as more intelligent references, a set of theorem \
definitions, an algorithm environment, and more. The class \
requires natbib."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.25fsvn44847"

RPM_NAME = "texlive-computational-complexity-2023.201.2.25fsvn44847-53.1.noarch.rpm"
RPM_HASH = "6602a4c04c27cf5b361281c98f316eb32a3588ddf09b55237519a3994c4bc2ef69c3d963b4fbd9be6ee4fd2bfec1a491b6d86f68604aa0c1912bc62a39894850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cc-cls.sty) tex(cc.cls) tex(cc2cite.sty) tex(cc4amsart.sty) tex(cc4apjrnl.sty) tex(cc4elsart.sty) tex(cc4jT.sty) tex(cc4llncs.sty) tex(cc4siamltex.sty) tex(cc4svjour.sty) tex(ccalgo.sty) tex(ccaux.sty) tex(cccite.sty) tex(ccdbs.sty) tex(cclayout.sty) tex(ccproof.sty) tex(ccqed.sty) tex(ccref.sty) tex(ccreltx.sty) tex(ccthm.sty) tex(relabel.sty) tex(thcc.sty) texlive-computational-complexity"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(article.cls) tex(babel.sty) tex(breakcites.sty) tex(breakurl.sty) tex(draftcopy.sty) tex(environ.sty) tex(fontenc.sty) tex(graphics.sty) tex(inputenc.sty) tex(lineno.sty) tex(multicol.sty) tex(natbib.sty) tex(theorem.sty) tex(url.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
