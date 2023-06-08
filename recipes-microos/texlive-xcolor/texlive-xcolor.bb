SUMMARY = "Driver-independent color extensions for LaTeX and pdfLaTeX"
DESCRIPTION = "The package starts from the basic facilities of the color \
package, and provides easy driver-independent access to several \
kinds of color tints, shades, tones, and mixes of arbitrary \
colors. It allows a user to select a document-wide target color \
model and offers complete tools for conversion between eight \
color models. Additionally, there is a command for alternating \
row colors plus repeated non-aligned material (like horizontal \
lines) in tables. Colors can be mixed like \
\\color{red!30!green!40!blue}."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn63563"

RPM_NAME = "texlive-xcolor-2023.201.2.14svn63563-52.1.noarch.rpm"
RPM_HASH = "c8adfd53f9d42171261c380a923ecfbf8967193e91aae392e88110b422080ea5ffadbcd95f4c7c555c81100d23bcc8191513d3370911576a81f0676ce50e1778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(svgnam.def) tex(x11nam.def) tex(xcolor.sty) texlive-xcolor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(colortbl.sty) tex(pdfcolmk.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
