SUMMARY = "Unofficial beamer theme for the University of Hohenheim"
DESCRIPTION = "The package provides a beamer theme which features the Ci \
colors of the University of Hohenheim. Please note that this is \
not an official Theme, and that there will be no support for \
it, from the University. Furthermore there is NO relationship \
between the University and this theme."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27036"

RPM_NAME = "texlive-hobete-2023.201.svn27036-53.1.noarch.rpm"
RPM_HASH = "abdfcef612e249a29c7be17737a746e52697253cb9076efdbcadadb8b9fb22e3a241cc76cb2b42204dd8461dd138bc70f1a00e1c2c10d58a712e2b0d2b055481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemehohenheim.sty) tex(beamerouterthemehohenheim.sty) tex(beamerouterthemehohenheimposter.sty) tex(beamerthemehohenheim.sty) tex(hobete.sty) texlive-hobete"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(l3keys2e.sty) tex(tikz.sty) tex(xfrac.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
