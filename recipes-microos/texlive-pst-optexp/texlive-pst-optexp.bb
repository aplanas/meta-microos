SUMMARY = "Drawing optical experimental setups"
DESCRIPTION = "The package is a collection of optical components that \
facilitate easy sketching of optical experimental setups. The \
package uses PSTricks for its output. A wide range of free-ray \
and fibre components is provided, the alignment, positioning \
and labelling of which can be achieved in very simple and \
flexible ways. The components may be connected with fibers or \
beams, and realistic raytraced beam paths are also possible."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1svn62977"

RPM_NAME = "texlive-pst-optexp-2023.201.6.1svn62977-52.1.noarch.rpm"
RPM_HASH = "e4bb9c4c84a697b11d39de6ffff54f0e7fa78d340930dfe01512c37268dcc58b453b814c0e5ff690dcd3b6cf8d5a49d3969ff4faba8b827eeed60bd5decbb9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-optexp.sty) texlive-pst-optexp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(environ.sty) tex(ifthen.sty) tex(multido.sty) tex(pst-eucl.sty) tex(pst-intersect.sty) tex(pst-node.sty) tex(pst-plot.sty) tex(pst-xkey.sty) tex(pstricks-add.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
