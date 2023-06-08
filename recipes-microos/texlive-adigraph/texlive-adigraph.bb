SUMMARY = "Augmenting directed graphs"
DESCRIPTION = "This LaTeX package provides the means to easily draw augmenting \
oriented graphs, as well as cuts on them, to demonstrate steps \
of algorithms for solving max-flow min-cut problems. This \
package requires the other LaTeX packages fp, xparse, xstring, \
and TikZ (in particular the TikZ calc library)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7.1svn49862"

RPM_NAME = "texlive-adigraph-2023.201.1.7.1svn49862-54.1.noarch.rpm"
RPM_HASH = "07f2c83ccd96ada014724253b1179b149c8d82e0b3128eea52ddce79e4c65df6088ed52fda10bd3bfc6a5599f1cc6ae9ddbc3656e001b58fc4a8ec13bee26ad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(adigraph.sty) texlive-adigraph"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(fp.sty) tex(tikz.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
