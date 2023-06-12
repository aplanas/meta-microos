SUMMARY = "Draw timing diagrams"
DESCRIPTION = "The package provides commands to draw and annotate various \
kinds of timing diagrams, using Tikz. Documentation is sparse, \
but the source and the examples file should be of some use."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn31491"

RPM_NAME = "texlive-timing-diagrams-2023.201.svn31491-52.1.noarch.rpm"
RPM_HASH = "08f26bd89dce21e49849a647d3e9e07418045914ff69f37f128a4ceed89f724147754f6e5b78682ca39c543c039d488c9f1c88b26baa2fe2df408c8bd6d17e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(timing-diagrams.sty) \
texlive-timing-diagrams"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
