SUMMARY = "Produce output similar to that of APJ"
DESCRIPTION = "A LaTeX class (based on current RevTeX) to produce preprints \
with the page layout similar to that of the Astrophysical \
Journal."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn28469"

RPM_NAME = "texlive-emulateapj-2023.201.svn28469-53.1.noarch.rpm"
RPM_HASH = "d23a00f8e23acd3bf2d03c9d39f16c1f2b34b698b6ddc13ea31eee363bf15db3864c89352ec58e83525575af0320dd58cc1013c6d971bc97b79cdf27d5efbdcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(emulateapj.cls) texlive-emulateapj"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(epsf.sty) tex(graphicx.sty) tex(latexsym.sty) tex(longtable.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
