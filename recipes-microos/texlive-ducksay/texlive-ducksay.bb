SUMMARY = "Draw ASCII art of animals saying a specified message"
DESCRIPTION = "The package draws ASCII art of animals saying a specified \
message. The following macros are available: \\ducksay \
\\duckthink \\DefaultAnimal \\AddAnimal \\DucksayOptions Multi-line \
messages are now fully supported. The package comes with two \
versions, choosable with the version key."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn64655"

RPM_NAME = "texlive-ducksay-2023.201.2.6svn64655-52.1.noarch.rpm"
RPM_HASH = "939e349d551864fe40ebfaf04c7a450b6f59051c144873a2e934eee855e4534636662af93a6921f90e55cf471159315ecd8cabeb4bb9f4df72cdd23ba0e0ae06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ducksay.animals.tex) tex(ducksay.code.v1.tex) tex(ducksay.code.v2.tex) tex(ducksay.sty) texlive-ducksay"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(l3keys2e.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
