SUMMARY = "Convenient mode selection in Beamer documents"
DESCRIPTION = "This class is a wrapper around the beamer class to make it \
easier to use the same document to generate the different forms \
of the presentation: the slides themselves, an abbreviated \
slide set for transparencies or online reference, an n-up \
handout version (various layouts are provided), and a \
transcript or set of notes using the article class. The class \
provides a variety of handout layouts, and allows the mode to \
be chosen from the command line (without changing the document \
itself)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn64182"

RPM_NAME = "texlive-beamerswitch-2023.201.1.9svn64182-53.1.noarch.rpm"
RPM_HASH = "87afef2b4debb8af34c056f7a01259959082122fadb20d397fe6cd9e0740326c3d4b07699e27a1f68d0ef12fdf86b22dff7944bf98feaaa80870ffd3beaaeda5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamerswitch.cls) \
texlive-beamerswitch"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(beamer.cls) \
tex(beamerarticle.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(iftex.sty) \
tex(pgf.sty) \
tex(pgfpages.sty) \
tex(shellesc.sty) \
tex(xkeyval.sty) \
tex(xkvltxp.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
