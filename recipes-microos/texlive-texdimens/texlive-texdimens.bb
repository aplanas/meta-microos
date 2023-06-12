SUMMARY = "Conversion of TeX dimensions to decimals"
DESCRIPTION = "Utilities and documentation related to TeX dimensional units, \
usable both with Plain (\\input texdimens) and with LaTeX \
(\\usepackage{texdimens})."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn61070"

RPM_NAME = "texlive-texdimens-2023.201.1.1svn61070-54.1.noarch.rpm"
RPM_HASH = "6895b7e03b6ad38308cd48ec074b406e216d3ac5813604ae2f918e0808da028f81468b8150a4d3ecb67bf92e47330b780cf297530084b2880e3301c4f247e9c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texdimens.sty) \
tex(texdimens.tex) \
texlive-texdimens"
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
