SUMMARY = "Typeset Japanese with pdfLaTeX and CJK"
DESCRIPTION = "The package provides a working configuration of the CJK \
package, suitable for Japanese typesetting of moderate quality. \
Moreover, it facilitates use of the CJK package for pLaTeX \
users, by providing commands that are similar to those used by \
the pLaTeX kernel and some other packages used with it."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn54080"

RPM_NAME = "texlive-bxcjkjatype-2023.201.0.0.3svn54080-52.1.noarch.rpm"
RPM_HASH = "69e66ec225add908c7f594ddba1dd4ed6ebc1e5b3c804399b77e941f9babb5963a1f799d4676b9595e427f5f6684b3a34fac9f1cd5effbe9fa35fc6ae1cf09de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bxcjkjatype.sty) \
texlive-bxcjkjatype"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(CJK.sty) \
tex(CJKpunct.sty) \
tex(CJKspace.sty) \
tex(CJKutf8.sty) \
tex(CJKvert.sty) \
tex(atbegshi.sty) \
tex(etoolbox.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
