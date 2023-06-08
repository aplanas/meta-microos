SUMMARY = "Utopia based OpenType Math font"
DESCRIPTION = "OpenType version of the fourier Type1 fonts designed by Michel \
Bovani."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-2023.201.0.0.56svn65684-53.1.noarch.rpm"
RPM_HASH = "9423c6dc0a6355163222114a57333c717c68a3cc5dcae765c852664f9312b694073587703fbf63d2e0984a8e8dea9a3f640d09a8950688530d9b70d9d0a16b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fourier-otf.sty) texlive-erewhon-math"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fourier-orns.sty) tex(iftex.sty) tex(realscripts.sty) tex(unicode-math.sty) tex(xkeyval.sty) texlive texlive-erewhon-math-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
