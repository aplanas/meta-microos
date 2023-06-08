SUMMARY = "A 'Chicago' bibliography style"
DESCRIPTION = "Chicago is a BibTeX style that follows the 'B' reference style \
of the 13th Edition of the Chicago manual of style; a LaTeX \
package (to LaTeX 2.09 conventions) is also provided. The style \
was derived from the newapa style."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chicago-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "279e2c87f286e532194f0f14fd861d7e5d65d24e21ed24e6d424b42aa3393e4d77f8e6b404278bd5a6187da26a19b703122109aacedcbcb28d88950433190e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chicago.sty) texlive-chicago"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
