SUMMARY = "Babel support for documents written in German"
DESCRIPTION = "This bundle is an extension to the babel package for \
multilingual typesetting. It provides all the necessary macros, \
definitions and settings to typeset German documents. The \
bundle includes support for the traditional and reformed German \
orthography as well as for the Austrian and Swiss varieties of \
German."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.13svn57978"

RPM_NAME = "texlive-babel-german-2023.201.2.13svn57978-53.1.noarch.rpm"
RPM_HASH = "4370a2c3e0a95b522bd44bf7875a829921d5c205886ec28109f6f94dee40623a02b9853ef61c8fffdcf26d08d3bec19cd7d5f41b2e291169240aff35b76bd0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(austrian.ldf) \
tex(german.ldf) \
tex(germanb.ldf) \
tex(naustrian.ldf) \
tex(ngerman.ldf) \
tex(ngermanb.ldf) \
tex(nswissgerman.ldf) \
tex(swissgerman.ldf) \
texlive-babel-german"
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
