SUMMARY = "Chinese/Japanese/Korean (base)"
DESCRIPTION = "Packages supporting a combination of Chinese, Japanese, Korean, \
including macros, fonts, documentation. Also Thai in the c90 \
encoding, since there is some overlap in those fonts; standard \
Thai support is in collection-langother. Additional packages \
for CJK are in their individual language collections."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn65824"

RPM_NAME = "texlive-collection-langcjk-2023.208.svn65824-58.1.noarch.rpm"
RPM_HASH = "bba049cea2fcaceeab61365e02568d2289c762c67da85c76060ccd540d0397038d36ecaf47e669f084cb6b3a4f1f527fac91646d3ad29cdc9d55e99f637ec5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langcjk"
RDEPENDS:${PN} += "texlive-adobemapping \
texlive-c90 \
texlive-cjk \
texlive-cjk-gs-integrate \
texlive-cjkpunct \
texlive-cjkutils \
texlive-collection-basic \
texlive-dnp \
texlive-evangelion-jfm \
texlive-fixjfm \
texlive-garuda-c90 \
texlive-jfmutil \
texlive-norasi-c90 \
texlive-pxtatescale \
texlive-xcjk2uni \
texlive-xecjk \
texlive-zitie \
texlive-zxjafont"

inherit rpm
