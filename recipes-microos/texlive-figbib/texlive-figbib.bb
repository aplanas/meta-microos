SUMMARY = "Organize figure databases with BibTeX"
DESCRIPTION = "FigBib lets you organize your figures in BibTeX databases. Some \
FigBib features are: Store and manage figures in a BibTeX \
database; Include figures in your LaTeX document with one short \
command; Generate a List of Figures containing more/other \
information than the figure captions; Control with one switch \
where to output the figures, either as usual float objects or \
in a separate part at the end of your document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19388"

RPM_NAME = "texlive-figbib-2023.201.svn19388-52.1.noarch.rpm"
RPM_HASH = "940564fea323c2ae8ed86c1859474e3f35f8a5641c2defae2bee36b1b41e74fcb52a194a4d6ac55b22ae78bbf49bfc97af1656c08cdc2ec25c8693727f14e660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(figbib.sty) texlive-figbib"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(epsfig.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
