SUMMARY = "Support for double-page floats"
DESCRIPTION = "Provides fullpage and leftfullpage environments, that may be \
used inside a figure, table, or other float environment. If the \
first of a 2-page spread uses a 'leftfullpage' environment, the \
float will only be typeset on an even-numbered page, and the \
two floats will appear side-by-side in a two-sided document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17196"

RPM_NAME = "texlive-dpfloat-2023.201.svn17196-52.1.noarch.rpm"
RPM_HASH = "98631b776c56870acee0aa8b92706f690b5db048bffa6557f30b976ba08f8f219021f3bc0012a5194b7ad7d20bc7faa717376650f1aec594e562fd66c1a60ff7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dpfloat.sty) \
texlive-dpfloat"
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
