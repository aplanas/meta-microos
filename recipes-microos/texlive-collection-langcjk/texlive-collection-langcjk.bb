SUMMARY = "Chinese/Japanese/Korean (base)"
DESCRIPTION = "Packages supporting a combination of Chinese, Japanese, Korean, \
including macros, fonts, documentation. Also Thai in the c90 \
encoding, since there is some overlap in those fonts; standard \
Thai support is in collection-langother. Additional packages \
for CJK are in their individual language collections."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65824"

RPM_NAME = "texlive-collection-langcjk-2023.201.svn65824-56.1.noarch.rpm"
RPM_HASH = "3db57495aaf025e1501499e96a0b78d2e3ce88aa91a2ed46160722db00a83bd18600df12ac76424b2d182debc61b7294cc9efb2161181d6785b872f5919547e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langcjk"
RDEPENDS:${PN} += "texlive-adobemapping texlive-c90 texlive-cjk texlive-cjk-gs-integrate texlive-cjkpunct texlive-cjkutils texlive-collection-basic texlive-dnp texlive-evangelion-jfm texlive-fixjfm texlive-garuda-c90 texlive-jfmutil texlive-norasi-c90 texlive-pxtatescale texlive-xcjk2uni texlive-xecjk texlive-zitie texlive-zxjafont"

inherit rpm
