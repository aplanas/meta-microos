SUMMARY = "Easy generation of timing diagrams as TikZ pictures"
DESCRIPTION = "This package provides macros and an environment to generate \
timing diagrams (digital waveforms) without much effort. The \
TikZ package is used to produce the graphics. The diagrams may \
be inserted into text (paragraphs, \\hbox, etc.) and into \
tikzpictures. A tabular-like environment is provided to produce \
larger timing diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-2023.201.0.0.7fsvn64967-52.1.noarch.rpm"
RPM_HASH = "0e26ba726364ffa8f6275999539c52d9c5994f044905fb71ff1961d9e7fc3a486d0f7d50c4292e3b300aa3fc7d355aaa72cc3e83c889848e5af1124a92bcc5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-timing-advnodes.sty) tex(tikz-timing-arrows.sty) tex(tikz-timing-beamer.sty) tex(tikz-timing-clockarrows.sty) tex(tikz-timing-columntype.sty) tex(tikz-timing-counters.sty) tex(tikz-timing-either.sty) tex(tikz-timing-ifsym.sty) tex(tikz-timing-interval.sty) tex(tikz-timing-nicetabs.sty) tex(tikz-timing-overlays.sty) tex(tikz-timing.sty) texlive-tikz-timing"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(array.sty) tex(booktabs.sty) tex(environ.sty) tex(pgfopts.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-svn-prov"

inherit rpm
