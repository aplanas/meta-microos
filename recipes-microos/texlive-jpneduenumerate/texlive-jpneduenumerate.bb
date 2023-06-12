SUMMARY = "Enumerative expressions in Japanese education"
DESCRIPTION = "Mathematical equation representation in Japanese education \
differs somewhat from the standard LaTeX writing style. This \
package introduces enumerative expressions in Japanese \
education."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn63893"

RPM_NAME = "texlive-jpneduenumerate-2023.201.1.2svn63893-55.1.noarch.rpm"
RPM_HASH = "5474c8f31652f95e21a81ec530c0de2d8e3c53203935fe6ed754e5450a6d6b204db4b657e17e3d57ed536e981e80e0ace6fd49f4b68c69272f8f78d178a75c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jpneduenumerate.sty) \
texlive-jpneduenumerate"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(enumitem.sty) \
tex(luatexja-otf.sty) \
tex(otf.sty) \
tex(refcount.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
