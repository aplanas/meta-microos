SUMMARY = "Add coffee stains to documents"
DESCRIPTION = "This package provides an essential feature that LaTeX has been \
missing for too long: It adds coffee stains to your documents. \
A lot of time can be saved by printing stains directly on the \
page rather than adding them manually."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-2023.201.0.0.5.1svn59703-53.1.noarch.rpm"
RPM_HASH = "9448f394885d6aca35426610e3da7ced85c1b6ba1fcd206e19bc53331fd8c8ccc824f26821cd8688dfdca2f61d5a95fff3580ad03f554d4a39792daceec30754"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(coffeestains.sty) \
texlive-coffeestains"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
