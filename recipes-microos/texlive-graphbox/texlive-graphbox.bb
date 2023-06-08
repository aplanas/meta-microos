SUMMARY = "Extend graphicx to improve placement of graphics"
DESCRIPTION = "Graphbox is an extension of the standard graphicx LaTeX2e \
package to allow the placement of graphics relative to the \
'current position' using additional optional arguments of \
\\includegraphics. For example, changing the vertical alignment \
is convenient for using graphics as elements of (mathematical) \
formulae. Options for shifting, smashing and hiding the \
graphics may be useful in support, for example, of the beamer \
framework."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46360"

RPM_NAME = "texlive-graphbox-2023.201.1.1svn46360-53.1.noarch.rpm"
RPM_HASH = "1b8405faff2b97eb7a50d5d6fa9e2f931932e97ca5606f9d2dbc884ab3d131cec8847e6560d1bc424b57c365aeda175169c923c66709d5baa31b0c1223705ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graphbox.sty) texlive-graphbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphicx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
