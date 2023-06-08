SUMMARY = "Coloured syntax highlights in documentation"
DESCRIPTION = "The package is used in documentation files (that use the doc \
package); with it the code listings will highlight (for \
example) pairs of curly braces with matching colors. Other \
delimiters like \\if ... \\fi, are highlighted, as are the names \
of new commands. All this makes code a little more readable, \
and helps during process of writing. Three options are \
provided, including a non-color option designed for printing \
(which numbers delimiters and underlines new commands)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18270"

RPM_NAME = "texlive-colordoc-2023.201.svn18270-53.1.noarch.rpm"
RPM_HASH = "a547bcc4068ca65df341c043955df9571317c3d1d57f4503bdcf09e05f4e30d24d565f5d0dc3f0a1091a8133753854d527918dcdc362a319b9e902e54ec380db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colordoc.sty) texlive-colordoc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(fixltx2e.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
