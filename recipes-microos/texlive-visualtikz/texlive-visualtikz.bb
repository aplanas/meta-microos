SUMMARY = "Visual help for TikZ based on images with minimum text"
DESCRIPTION = "Visual help for TikZ based on images with minimum text: an \
image per command or parameter. The document is in French, but \
will be translated into English later."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.65svn54080"

RPM_NAME = "texlive-visualtikz-2023.201.0.0.65svn54080-53.1.noarch.rpm"
RPM_HASH = "b58e1d384b0be4826c6bc0466aff6145dfef1585f5fcba7efc9ae4d85ae3b5039e38eab87b5feeb54a8306678fff1f6fbf0e782303862a8352a57241ecd24c4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualtikz"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
