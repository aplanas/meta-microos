SUMMARY = "References for TeX and Friends"
DESCRIPTION = "This is an ongoing project with the aim of providing a help \
file for LaTeX (and its friends like ConTeXt, MetaPost, \
Metafont, etc.) using a state-of-the-art source format, aka \
DocBook/XML."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.8svn57349"

RPM_NAME = "texlive-tex-refs-2023.201.0.0.4.8svn57349-54.1.noarch.rpm"
RPM_HASH = "6e207f07d662c4f3a1db7bd36870e33e2cf09a538be5984f39e031d0f138040349b84c34822e631f9eaf60ce75a3c0318969bb416677f7a9e1708043a9b3c8d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-refs"
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
