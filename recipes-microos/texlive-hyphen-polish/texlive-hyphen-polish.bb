SUMMARY = "Polish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Polish in QX and UTF-8 encodings. \
These patterns are also used by Polish TeX formats MeX and \
LaMeX."
LICENSE = "SUSE-TeX"

PV = "2023.201.3.0bsvn58609"

RPM_NAME = "texlive-hyphen-polish-2023.201.3.0bsvn58609-52.1.noarch.rpm"
RPM_HASH = "e38833e7ba0d47b7f036a6745e5d2a3516188515714b2172236e3f937b1e0598a8c7c156e5e6b3547ab26b129eb4a5bfdae800acd694f049b2cf5b992ec4c52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-pl.qx.tex) tex(hyph-pl.tex) tex(loadhyph-pl.tex) texlive-hyphen-polish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
