SUMMARY = "A fancy means of underlining"
DESCRIPTION = "The package combines the use of soul with the savepos mechanism \
of current pdfTeX so that the user can create (almost) \
arbitrary underlining and similar 'decorations', including \
rules, leaders and even pictures (pgf, pstricks, etc.). Unlike \
soul underlines, which are built by repeating small elements, \
here each chunk of text to be underlined is a single element."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn60772"

RPM_NAME = "texlive-soulpos-2023.201.1.2svn60772-57.1.noarch.rpm"
RPM_HASH = "d8b2b1238919036f38226a6df59e93136461b25448ae2a34ea22ae3c9bd98dc0c9fb17a3cec21596b2ad3a5be517263a4c903bfdfe972b19941283be337a6751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(soulpos.sty) \
texlive-soulpos"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
tex(soulutf8.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-soul"

inherit rpm
