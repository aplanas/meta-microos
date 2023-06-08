SUMMARY = "Typeset fregean Begriffsschrift"
DESCRIPTION = "The package defines a number of new commands for typesetting \
fregean Begriffsschrift in LaTeX. It is loosely based on the \
package begriff, and offers a number of improvements including \
better relative lengths of the content stroke with respect to \
other strokes, content strokes that point at the middle of \
lines rather than the bottom, a greater width for the assertion \
stroke as compared to the content stroke, a more intuitive \
structure for the conditional, greater care taken to allow for \
the linewidth in the spacing of formulas."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn27417"

RPM_NAME = "texlive-frege-2023.201.1.3svn27417-52.1.noarch.rpm"
RPM_HASH = "8c389de7ff1272296fc05dfbf73eb94ed26aaecb9d4461ce68c223b597bdaeb3e345efa44b67f8af44eea1276deb2bda91acbb2c623fe42ab343dd92d8d1b8a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(frege.sty) texlive-frege"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amssymb.sty) tex(bguq.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
