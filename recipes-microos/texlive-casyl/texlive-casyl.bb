SUMMARY = "Typeset Cree/Inuktitut in Canadian Aboriginal Syllabics"
DESCRIPTION = "The bundle constitutes a font (as Metafont source) and LaTeX \
macros for its use within a document."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-casyl-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "45d4a341b44b2e78dbafc753d8cc2626550f8ad292cc436a99a55daa44b2334f6b9813c36a3c462c90741e4c8243291e28093b29f48b2605e7535e22cbee8ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(casyll10.tfm) \
tex(casyltex.sty) \
texlive-casyl"
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
