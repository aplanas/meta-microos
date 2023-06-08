SUMMARY = "Thesis template for the Nanjing University of Science and Technology"
DESCRIPTION = "This is a thesis template for the Nanjing University of Science \
and Technology>."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-2023.201.0.0.0.1svn62451-54.1.noarch.rpm"
RPM_HASH = "4f79591d9482a5c4f05a697b4a9fc6bd589e38be862c239ed7ddbfde4a4c76ca1de9f94c892e7f16c31336f63ebb9c5582aa7517e9a15105e6193511c58d1e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(njustthesis.cls) texlive-njustthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(boxedminipage.sty) tex(csquotes.sty) tex(enumitem.sty) tex(exercise.sty) tex(fancyhdr.sty) tex(graphicx.sty) tex(indentfirst.sty) tex(kvdefinekeys.sty) tex(kvoptions.sty) tex(kvsetkeys.sty) tex(multicol.sty) tex(newtxmath.sty) tex(pifont.sty) tex(setspace.sty) tex(tabu.sty) tex(titletoc.sty) tex(tocbibind.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
