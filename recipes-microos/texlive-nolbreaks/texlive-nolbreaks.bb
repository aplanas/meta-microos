SUMMARY = "No line breaks in text"
DESCRIPTION = "Use \\nolbreaks{some text} to prevent line breaks in 'some \
text'. This has the advantage over \\mbox{} that glue (rubber \
space) remains flexible. Most common cases are handled here \
(\\linebreak is disabled, for example) but spaces hidden in \
macros or { } can still create break-points."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn26786"

RPM_NAME = "texlive-nolbreaks-2023.201.1.2svn26786-54.1.noarch.rpm"
RPM_HASH = "60ec734210e83ae55588ecabc15a58c35b85784f2f642ec1f2c50ee3ebfcb9c033beb7b35207b673e90943f9c681e9a81df135ebc6f7f9c15be4e154f30f9a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nolbreaks.sty) texlive-nolbreaks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
