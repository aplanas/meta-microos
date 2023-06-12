SUMMARY = "Diagram macros by Michael Barr"
DESCRIPTION = "Diagxy is a general diagramming package, useful for diagrams in \
a number of mathematical disciplines. Diagxy is a development \
of an earlier (successful) package to use the facilities of the \
xypic bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38479"

RPM_NAME = "texlive-barr-2023.201.svn38479-53.1.noarch.rpm"
RPM_HASH = "724aca5cd9f682f84039aad4e7951a103aeb873579ce8b5a5df933dfde82fc465ccca38176ae3bfca477a7cc8773f1e8f1ccc1cf0f9ac5a48a2aabf6e5c29502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(diagxy.tex) \
texlive-barr"
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
