SUMMARY = "A todo that snaps to the closer side"
DESCRIPTION = "This package is an alternative to todonotes, from which it \
differs in the following ways: Depending on where you call \
\\snaptodo, the note is put in the left or the right margin, \
whichever is closer. The notes bump each other so they never \
overlap; the lines never overlap either. Aesthetic and \
customizable style."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61155"

RPM_NAME = "texlive-snaptodo-2023.201.svn61155-57.1.noarch.rpm"
RPM_HASH = "add0709616bc3e89c95354ed2dc1eb8bd41b6b40de17ab7478379e1b8069636e9fd04a4a825edc45210e66c4adb10557d63fafaa521d7feec53e3c37cdce7e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(snaptodo.sty) texlive-snaptodo"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tikzpagenodes.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
