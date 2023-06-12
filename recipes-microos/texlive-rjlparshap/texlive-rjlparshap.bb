SUMMARY = "Support for use of \\parshape in LaTeX"
DESCRIPTION = "The package provides macros and environments that relieve the \
programmer of some of the difficulties of using \\parshape in \
LaTeX macros. It does not actually calculate shapes in the way \
that the shapepar package does."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "593d3c0d4741e77a55dcb425f7e5c9560d92614905674abbf4ad413d60c1edef1356a286734f4890b972246c170b028443a067097e5f180551d4618effc0491b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rjlpshap.sty) \
texlive-rjlparshap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(arrayjob.sty) \
tex(forloop.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
