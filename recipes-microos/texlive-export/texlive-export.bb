SUMMARY = "Import and export values of LaTeX registers"
DESCRIPTION = "The package allows the user to export/import the values of \
LaTeX registers (counters, rigid and rubber lengths only). It \
is not for faint-hearted users. The package may be used, for \
example, to communicate between documents for the purposes of \
dvipaste."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn27206"

RPM_NAME = "texlive-export-2023.201.1.8svn27206-52.1.noarch.rpm"
RPM_HASH = "403c1640eb3c8db6d511235627bcd60d47b19fe6bda306ba16ce62a970aeec9cd759f15d3f2cb22ab676ad5e8ea219ad6a52fc7fcadffc5b619a999ccb9df855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dvipaste.sty) \
tex(export.sty) \
texlive-export"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
