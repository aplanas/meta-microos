SUMMARY = "Capital A and capital R ligature for Aspect Ratio"
DESCRIPTION = "The package provides fonts (both as Adobe Type 1 format, and as \
Metafont source) for the 'AR' symbol (for Aspect Ratio) used by \
aeronautical scientists and engineers. Note that the package \
supersedes the package ar"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn25243"

RPM_NAME = "texlive-aspectratio-2023.201.2.0svn25243-53.1.noarch.rpm"
RPM_HASH = "5bd4558efedd85590b5ed288f7bc2ef70fc51e1cabe9cbb03cb07ea28599a6903ebaf27ea08c4b97c2051a3746bd541074d5f2342b8f25c0e5f851254aa487e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(amarbi.tfm) \
tex(amarri.tfm) \
tex(aparbi.tfm) \
tex(aparri.tfm) \
tex(ar.sty) \
tex(ar10.tfm) \
tex(ar12.tfm) \
tex(ar5.tfm) \
tex(ar6.tfm) \
tex(ar7.tfm) \
tex(ar8.tfm) \
tex(ar9.tfm) \
tex(arb10.tfm) \
tex(arb12.tfm) \
tex(arb5.tfm) \
tex(arb6.tfm) \
tex(arb7.tfm) \
tex(arb8.tfm) \
tex(arb9.tfm) \
tex(arssbi10.tfm) \
tex(arssi10.tfm) \
tex(artti10.tfm) \
tex(aspectratio.map) \
texlive-aspectratio"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-aspectratio-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
