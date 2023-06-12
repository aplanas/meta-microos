SUMMARY = "Draw 'funny' objects with PSTricks"
DESCRIPTION = "This is a PSTricks related package for drawing funny objects, \
like ant, bird, fish, kangaroo, ... Such objects may be useful \
for testing other PSTricks macros and/or packages. (Or they can \
be used for fun...)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn17909"

RPM_NAME = "texlive-pst-fun-2023.201.0.0.04svn17909-52.1.noarch.rpm"
RPM_HASH = "e6589f00cdd2b1ff69bb84478fbd8f0acaf2ceb962d422c3fa02bf84884ac3459400b06de4296d873b0214b5bd12453b1766c728d512fdc44bc1dfe4fe9efa06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-fun.sty) \
tex(pst-fun.tex) \
texlive-pst-fun"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pst-grad.sty) \
tex(pst-slpe.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
