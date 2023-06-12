SUMMARY = "The Libertinus font family"
DESCRIPTION = "This is a fork of the Linux Libertine and Linux Biolinum fonts \
that started as an OpenType math companion of the Libertine \
font family, but grown as a full fork to address some of the \
bugs in the fonts. The family consists of: Libertinus Serif: \
forked from Linux Libertine. Libertinus Sans: forked from Linux \
Biolinum. Libertinus Mono: forked from Linux Libertine Mono. \
Libertinus Math: an OpenType math font for use in OpenType \
math-capable applications like LuaTeX, XeTeX or MS Word 2007+."
LICENSE = "OFL-1.1"

PV = "2023.201.7.040svn57948"

RPM_NAME = "texlive-libertinus-fonts-2023.201.7.040svn57948-54.1.noarch.rpm"
RPM_HASH = "afada2d93f4ccc2964afdae0d748a51d6f1d2943bc32dae04cf48f03537106f9cad84dd3f77eaf223c106cf980e1199182a8f471f30ff559d67a6f7a1e7e4c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts"
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
texlive-libertinus-fonts-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
