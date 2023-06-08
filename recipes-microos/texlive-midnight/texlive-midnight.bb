SUMMARY = "A set of useful macro tools"
DESCRIPTION = "Included are: quire: making booklets, etc.; gloss: vertically \
align words in consecutive sentences; loop: a looping \
construct; dolines: 'meta'-macros to separate arguments by \
newlines; labels: address labels and bulk mail letters; \
styledef: selectively input part of a file; and border: borders \
around boxes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-midnight-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "da8625036124532cf29f12a8e5a93f6b182493b46ac5db9c39275ca70749e82a3000892482e8a1a70bbcded1281e4d89b17da68ad10bbcdac1c37efd95174801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(border.tex) tex(dolines.tex) tex(gloss.tex) tex(labels.tex) tex(loop.tex) tex(quire.tex) tex(styledef.tex) texlive-midnight"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
