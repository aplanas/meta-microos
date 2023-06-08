SUMMARY = "A modern, elegant, and versatile theme for Beamer"
DESCRIPTION = "This package provides a modern, elegant and versatile theme for \
Beamer, with a high degree of customization. Trigon found its \
origin and inspiration in the graphical guidelines resulting \
from the visual identity overhaul of the University of Liege. \
Although directly inspired from these guidelines, the theme was \
stripped out of any mention or specificities related to the \
University and its faculties. This makes the Trigon theme \
perfectly suitable for many different contexts. The final \
product provides a modern, elegant and versatile theme with a \
high degree of customization. The main design focuses on \
triangular shapes for major layout elements and noise \
minimization for the main body of the work. The theme's \
implementation is heavily inspired from the Metropolis theme. \
Most options from Metropolis have been ported to Trigon in \
order to improve customization and ease-of-use. Trigon also \
includes different styles and layouts for the main title page, \
the section page and the default slide background."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn65985"

RPM_NAME = "texlive-beamertheme-trigon-2023.201.0.0.7.0svn65985-53.1.noarch.rpm"
RPM_HASH = "f9bfaf50454b6c75aca8480822166c093459e12bd2acbdd7e2c4312fc1615b8e5954eecf6fa472baafa1a27dea7eb25ec3c03c7a84eac9ffcd2d77ce455d46b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemetrigon.sty) tex(beamerfontthemetrigon.sty) tex(beamerinnerthemetrigon.sty) tex(beamerouterthemetrigon.sty) tex(beamerthemetrigon.sty) texlive-beamertheme-trigon"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgfopts.sty) tex(sourcesanspro.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
