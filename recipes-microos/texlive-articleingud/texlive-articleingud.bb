SUMMARY = "LaTeX class for articles published in INGENIERIA review"
DESCRIPTION = "The class is for articles published in INGENIERIA review. It is \
derived from the standard LaTeX class article."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-2023.201.0.0.3svn38741-53.1.noarch.rpm"
RPM_HASH = "46e9c547e99a6765e5768ca9184b5c66697441595eac57426697b7a644001c70e2861ce438982ee05d701eb47a11a39c36219584ff3b997965dd6a0cea574cdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(articleingud.cls) \
texlive-articleingud"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
