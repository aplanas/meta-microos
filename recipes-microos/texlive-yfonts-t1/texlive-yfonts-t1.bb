SUMMARY = "Old German-style fonts, in Adobe type 1 format"
DESCRIPTION = "This package comprises type 1 versions of the Gothic, \
Schwabacher and Fraktur fonts of Yannis Haralambous' set of old \
German fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-2023.201.1.0svn36013-52.1.noarch.rpm"
RPM_HASH = "2632b77b012d18988cf089d79c4dfd1f80bf1ca2b8a6b8830c230f508f0b7481824a8b993b03c104af3ffa85d35170a79395edf514efe97d42b6e959dad39dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(yfrak.map) \
texlive-yfonts-t1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-t1-fonts"

inherit rpm
