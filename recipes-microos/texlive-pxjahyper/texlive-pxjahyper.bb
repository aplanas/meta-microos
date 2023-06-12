SUMMARY = "Hyperref support for pLaTeX"
DESCRIPTION = "This package adjusts the behavior of hyperref on (u)pLaTeX so \
that authors can properly create PDF documents that contain \
document information in Japanese."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-2023.201.1.3svn66272-53.1.noarch.rpm"
RPM_HASH = "b7db0246e385ee1eb7415b0c79ac9f8d8c8e8d052c69a67dc846e1586f5e1ae105e30043cd6984c3633864422304eff5f425f5b359b87d5595143c5d4f06feaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxjahyper-ajm.def) \
tex(pxjahyper-enc.sty) \
tex(pxjahyper-uni.def) \
tex(pxjahyper.sty) \
texlive-pxjahyper"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(bxjatoucs.sty) \
tex(etoolbox.sty) \
tex(keyval.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
