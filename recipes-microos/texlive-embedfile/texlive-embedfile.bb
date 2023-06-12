SUMMARY = "Embed files into PDF"
DESCRIPTION = "This package embeds files in a PDF document, using the PDF \
format's embedding operation (note the contrast with the attach \
operation used by the attachfile and attachfile2 packages). \
Currently only pdfTeX >=1.30, in PDF mode, is supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn65528"

RPM_NAME = "texlive-embedfile-2023.201.2.12svn65528-53.1.noarch.rpm"
RPM_HASH = "f0b7e066d9df43b38d04b3bd16a72e989c3d9634e2912e61deae49081fc489497f0b9ed7684af6079b1e2adfa2109470592fba10b530c873f87d5e7a446c8825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dtx-attach.sty) \
tex(embedfile.sty) \
texlive-embedfile"
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
