SUMMARY = "Typeset notes, in the margin"
DESCRIPTION = "The package provides a macro \\sidenote, that places a note in \
the margin of the document, with its baseline aligned with the \
baseline in the body of the document. These sidenotes are \
numbered (both in the text, and on the notes themselves). The \
package loads the package etoolbox, pgfopts and marginnote."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn61992"

RPM_NAME = "texlive-snotez-2023.201.0.0.7svn61992-57.1.noarch.rpm"
RPM_HASH = "d5dde32e6e1419cfacd54a0c4aec5d7decfe68163111e1fcfec13a385096730f3166829c104cb8fb78b2b4e3f89ccfb0a01b55a673459ce2e8d8fa95401b23ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(snotez.sty) texlive-snotez"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(marginnote.sty) tex(pgfopts.sty) tex(zref-perpage.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
