SUMMARY = "URW Antiqua condensed font, for use with TeX"
DESCRIPTION = "The package contains a copy of the Type 1 font 'URW Antiqua \
2051 Regular Condensed' released under the GPL by URW, with \
supporting files for use with (La)TeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.001.003svn24266"

RPM_NAME = "texlive-antiqua-2023.201.001.003svn24266-54.1.noarch.rpm"
RPM_HASH = "7c67de9522c70356c0a46ea38d7bdff926b6cd4ae0c4a693c93ba912c8cedc8be65b11d3e488127b23c90c2726078422e6c6369ab4719c623df677b6fdc40d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ot1uaq.fd) \
tex(t1uaq.fd) \
tex(ts1uaq.fd) \
tex(uaq.map) \
tex(uaqr7tc.tfm) \
tex(uaqr7tc.vf) \
tex(uaqr8ac.tfm) \
tex(uaqr8cc.tfm) \
tex(uaqr8cc.vf) \
tex(uaqr8rc.tfm) \
tex(uaqr8tc.tfm) \
tex(uaqr8tc.vf) \
tex(uaqrc7tc.tfm) \
tex(uaqrc7tc.vf) \
tex(uaqrc8tc.tfm) \
tex(uaqrc8tc.vf) \
tex(uaqro7tc.tfm) \
tex(uaqro7tc.vf) \
tex(uaqro8cc.tfm) \
tex(uaqro8cc.vf) \
tex(uaqro8rc.tfm) \
tex(uaqro8tc.tfm) \
tex(uaqro8tc.vf) \
texlive-antiqua"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-antiqua-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
