SUMMARY = "Footnotes for critical editions"
DESCRIPTION = "The package aims to provide a 'one-stop' solution to \
requirements for footnotes. It offers: Multiple footnote \
apparatus superior to that of manyfoot Footnotes can be \
formatted in separate paragraphs, or be run into a single \
paragraph (this choice may be selected per footnote series); \
Things you might have expected (such as \\verb-like material in \
footnotes, and colour selections over page breaks) now work. \
Note that the majority of the bigfoot package's interface is \
identical to that of manyfoot; users should seek information \
from that package's documentation. The bigfoot bundle also \
provides the perpage and suffix packages."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn38248"

RPM_NAME = "texlive-bigfoot-2023.201.2.1svn38248-53.1.noarch.rpm"
RPM_HASH = "4fe72770a6eee9be6e0343af850b92512aab1702eb34ace0fca1c65ab32e1e9d1a3f28f279ae443e4e65488b4b12c99123acdfb74066e111f71af7f072216ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bigfoot.sty) tex(perpage.sty) tex(suffix.sty) texlive-bigfoot"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etex.sty) tex(manyfoot.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
