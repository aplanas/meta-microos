SUMMARY = "Core TeX and Metafont sources from Knuth"
DESCRIPTION = "A collection of core TeX and Metafont macro files from DEK, \
apart from the plain format and base. Includes the MF logo \
font(s), webmac.tex, etc."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn57963"

RPM_NAME = "texlive-knuth-lib-2023.201.svn57963-55.1.noarch.rpm"
RPM_HASH = "f13fff73c0f583c6070c8156c30cfb9b992a946c5cc4ddc39d73d0eed45a2f4b68bb57e22f2a80884e3ad2ef84b55f654850aca0348bf20243cca1e2ffe89fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(logo10.tfm) \
tex(logo8.tfm) \
tex(logo9.tfm) \
tex(logobf10.tfm) \
tex(logosl10.tfm) \
tex(manfnt.tfm) \
tex(manmac.tex) \
tex(mftmac.tex) \
tex(null.tex) \
tex(story.tex) \
tex(testfont.tex) \
tex(webmac.tex) \
texlive-knuth-lib \
texlive-misc"
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
