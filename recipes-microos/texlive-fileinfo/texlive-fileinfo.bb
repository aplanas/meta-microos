SUMMARY = "Enhanced display of LaTeX File Information"
DESCRIPTION = "The bundle provides two packages, readprov and myfilist. The \
readprov package provides a means of reading file information \
without loading the body of the file. The myfilist package uses \
readprov and controls what \\listfiles will report."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-2023.201.0.0.81asvn28421-52.1.noarch.rpm"
RPM_HASH = "ca530d71b6fd9376dc34817c7c8f77320b23e9129664faab9fddde6a965ec75491f8c99dca389a1df9e572cd2237a319e7e61a028a7297d5dd8c1ef7e8bccd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(myfilist.sty) \
tex(readprov.sty) \
texlive-fileinfo"
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
