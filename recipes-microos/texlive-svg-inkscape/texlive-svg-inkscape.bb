SUMMARY = "How to include an SVG image in LaTeX using Inkscape"
DESCRIPTION = "The document demonstrates the use of SVG images in LaTeX \
documents. Using the 'PDF+LaTeX output' option of Inkscape, it \
is possible to include SVG in documents, in which LaTeX \
typesets the text. This results in uniform text style \
throughout the document, including text in images; moreover, \
LaTeX commands may be used in the image's text, providing such \
things as mathematics and references. The document also \
describes how to automate the conversion from SVG to PDF+LaTeX \
using Inkscape."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32199"

RPM_NAME = "texlive-svg-inkscape-2023.201.svn32199-57.1.noarch.rpm"
RPM_HASH = "911ff835770e91d2c50d4ce07665ea087ab4e952c1655f2ed924b76c4c1a0c5bbac3b1cb34246b0bb2c2fe84d271022780b858b0313a52b3ef67a21804b47e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-inkscape"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
