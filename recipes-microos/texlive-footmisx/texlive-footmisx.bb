SUMMARY = "A range of footnote options"
DESCRIPTION = "This a fork of footmisc package allowing to use hyperref. Here \
is a copy of the description of package footmisc: A collection \
of ways to change the typesetting of footnotes. The package \
provides means of changing the layout of the footnotes \
themselves (including setting them in 'paragraphs' -- the para \
option), a way to number footnotes per page (the perpage \
option), to make footnotes disappear in a 'moving' argument \
(stable option) and to deal with multiple references to \
footnotes from the same place (multiple option). The package \
also has a range of techniques for labelling footnotes with \
symbols rather than numbers. Some of the functions of the \
package are overlap with the functionality of other packages. \
The para option is also provided by the manyfoot and bigfoot \
packages, though those are both also portmanteau packages. \
(Don't be seduced by fnpara, whose implementation is improved \
by the present package.) The perpage option is also offered by \
footnpag and by the rather more general-purpose perpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.20161201svn42621"

RPM_NAME = "texlive-footmisx-2023.201.20161201svn42621-52.1.noarch.rpm"
RPM_HASH = "080c80a82d4d1996301566b3efb4ff4fdf5e1f64f858fb2aa403cddbd25e97f74247597b1bba3ad1ae9c66cf9049847edaa873429dff7c9a35036370f7055c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(footmisx.sty) texlive-footmisx"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
