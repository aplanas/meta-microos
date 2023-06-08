SUMMARY = "Decorative chapter headings"
DESCRIPTION = "A package for creating decorative chapter headings with \
quotations. Uses graphical and coloured output and by default \
needs the 'Adobe standard font set' (as supported by psnfss)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn56926"

RPM_NAME = "texlive-quotchap-2023.201.1.3svn56926-53.1.noarch.rpm"
RPM_HASH = "e43c1a1825fb7a44b7db820f27b2fd69d2fdb1ff93cb98eab05e4313e70a3f42db42c55e2be367d76610627d043649bfe2361b0b5b62e168c2a26ba26347116c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(quotchap.sty) texlive-quotchap"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
