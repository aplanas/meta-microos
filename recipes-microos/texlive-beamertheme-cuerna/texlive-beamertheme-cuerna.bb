SUMMARY = "A beamer theme with 4 colour palettes"
DESCRIPTION = "The package contains a theme for Beamer which is referenced as \
'Cuerna' inside beamer and has four basic colour themes. The \
title page shows rectangles that represent the Fibonacci \
sequence, and spiral is drawn on top of the rectangles. Besides \
that the rest of the graphic elements in the slides are scarce \
to keep it clean"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-2023.201.svn42161-53.1.noarch.rpm"
RPM_HASH = "fdadb2b5c724a1ac918f151e810bf0d0112e210a8e2e9084fb2d967cef5cdb84612650f3c283465eb406373f65474f4a2e5ac5e104fd3ad89db82106a797e9bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeCuerna.sty) \
tex(beamercolorthemebluesimplex.sty) \
tex(beamercolorthemebrick.sty) \
tex(beamercolorthemelettuce.sty) \
tex(beamerinnerthemeCuerna.sty) \
tex(beamerouterthemeCuerna.sty) \
tex(beamerthemeCuerna.sty) \
texlive-beamertheme-cuerna"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(graphicx.sty) \
tex(lmodern.sty) \
tex(textpos.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
