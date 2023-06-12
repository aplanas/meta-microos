SUMMARY = "Expandable token list operations"
DESCRIPTION = "This package provides expandable token list operations for \
which expl3's l3tl only has unexpandable variants. These \
expandable versions are typically slower than the unexpandable \
code. Unlike the l3tl versions, the functions in this module \
may contain braces and macro parameter tokens in their \
arguments, but as a drawback they cannot distinguish some \
tokens and do not consider the character code of group-begin \
and group-end tokens. Additionally a general map to token lists \
is provided, modelled after the expl3 internal __tl_act:NNNn \
but with additional features. The package has no immediate use \
for document authors; it only contains expl3 functions intended \
for programmers."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn60998"

RPM_NAME = "texlive-etl-2023.201.0.0.3svn60998-52.1.noarch.rpm"
RPM_HASH = "859b292065b1da4eda43850897148f9a03a93e6e63fe32f6a4db0bce9db556f9ba8b413cdbde06077fdc4ff4df754fbd7707bfd7dceeb96baa92fbfb43800087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etl.sty) \
texlive-etl"
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
