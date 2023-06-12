SUMMARY = "A XeLaTeX package for theses and dissertations at Iranian Universities"
DESCRIPTION = "A package for preparing dissertations and theses for Iranian \
universities as fast and as efficiently as possible. The \
package depends on xparse, fancyhdr, graphicx, multirow, float, \
and adjustbox."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn54840"

RPM_NAME = "texlive-parsa-2023.201.1.3svn54840-51.1.noarch.rpm"
RPM_HASH = "d6c7dddd3e54a2dc09c36e6aa591c1199740f3740541160756bd78ec3f0ca8d0887643a608f8154803f4b917f58fbcaa6fa62f16007eace8ac48d767dc5a57db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(parsa.sty) \
texlive-parsa"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(adjustbox.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(graphicx.sty) \
tex(multirow.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
