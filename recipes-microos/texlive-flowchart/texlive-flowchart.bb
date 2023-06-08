SUMMARY = "Shapes for drawing flowcharts, using TikZ"
DESCRIPTION = "The package provides a set of 'traditional' flowchart element \
shapes; the documentation shows how to build a flowchart from \
these elements, using pgf/TikZ. The package also requires the \
makeshape package."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.3svn36572"

RPM_NAME = "texlive-flowchart-2023.201.3.3svn36572-52.1.noarch.rpm"
RPM_HASH = "96b2bdd168be1293a68ad759a96713173b2ba46faa190880c2febc44b566a4afdb37b2223c7a61a937b8b9b57096f3dc819da7d462fad141db9617c15e193755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(flowchart.sty) texlive-flowchart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(makeshape.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
