SUMMARY = "MetaPost and Metafont packages"
DESCRIPTION = "The collection-metapost package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn64878"

RPM_NAME = "texlive-collection-metapost-2023.208.svn64878-58.1.noarch.rpm"
RPM_HASH = "f7b0bf6b730c15614f72dd60c23d14a24c33ec471a1ce59daddd326a9e78c2b8cf2ee3190d47c4af48250c73a71ac8322ad10c48498d4b317d1b1374ee953b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metapost) \
texlive-collection-metapost"
RDEPENDS:${PN} += "texlive-automata \
texlive-bbcard \
texlive-blockdraw_mp \
texlive-bpolynomial \
texlive-cmarrows \
texlive-collection-basic \
texlive-drv \
texlive-dviincl \
texlive-emp \
texlive-epsincl \
texlive-expressg \
texlive-exteps \
texlive-featpost \
texlive-feynmf \
texlive-feynmp-auto \
texlive-fiziko \
texlive-garrigues \
texlive-gmp \
texlive-hatching \
texlive-hershey-mp \
texlive-latexmp \
texlive-mcf2graph \
texlive-metago \
texlive-metaobj \
texlive-metaplot \
texlive-metapost \
texlive-metapost-colorbrewer \
texlive-metauml \
texlive-mfpic \
texlive-mfpic4ode \
texlive-minim-hatching \
texlive-mp3d \
texlive-mparrows \
texlive-mpattern \
texlive-mpcolornames \
texlive-mpgraphics \
texlive-mptrees \
texlive-piechartmp \
texlive-repere \
texlive-roex \
texlive-roundrect \
texlive-shapes \
texlive-slideshow \
texlive-splines \
texlive-suanpan \
texlive-textpath \
texlive-threeddice"

inherit rpm
