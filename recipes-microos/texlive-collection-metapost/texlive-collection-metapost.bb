SUMMARY = "MetaPost and Metafont packages"
DESCRIPTION = "The collection-metapost package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64878"

RPM_NAME = "texlive-collection-metapost-2023.201.svn64878-56.1.noarch.rpm"
RPM_HASH = "ad0370468f0f2683aadb36295640dcf78b79e4e2aa2dce71257003c69436e561dcb24108e8428034531d121d6a5da13a6cb0d97e3dafed03833a160d5c395050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(metapost) texlive-collection-metapost"
RDEPENDS:${PN} += "texlive-automata texlive-bbcard texlive-blockdraw_mp texlive-bpolynomial texlive-cmarrows texlive-collection-basic texlive-drv texlive-dviincl texlive-emp texlive-epsincl texlive-expressg texlive-exteps texlive-featpost texlive-feynmf texlive-feynmp-auto texlive-fiziko texlive-garrigues texlive-gmp texlive-hatching texlive-hershey-mp texlive-latexmp texlive-mcf2graph texlive-metago texlive-metaobj texlive-metaplot texlive-metapost texlive-metapost-colorbrewer texlive-metauml texlive-mfpic texlive-mfpic4ode texlive-minim-hatching texlive-mp3d texlive-mparrows texlive-mpattern texlive-mpcolornames texlive-mpgraphics texlive-mptrees texlive-piechartmp texlive-repere texlive-roex texlive-roundrect texlive-shapes texlive-slideshow texlive-splines texlive-suanpan texlive-textpath texlive-threeddice"

inherit rpm
