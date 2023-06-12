SUMMARY = "A collection of bibliographies"
DESCRIPTION = "A collection of BibTeX bibliographies on TeX-related topics \
(including, for example, spell-checking and SGML). Each \
includes a LaTeX wrapper file to typeset the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66286"

RPM_NAME = "texlive-beebe-2023.201.svn66286-53.1.noarch.rpm"
RPM_HASH = "ba44a537a9a9765dc2ceb893685dab8b0efc9ba9acd22577c42ee8b7824f5f3916779e3f7f2afa8be4bb1e1b92efd6703cfa149e3931ef74956867e3dac9bf56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibnames.sty) \
tex(texnames.sty) \
tex(tugboat.def) \
texlive-beebe"
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
