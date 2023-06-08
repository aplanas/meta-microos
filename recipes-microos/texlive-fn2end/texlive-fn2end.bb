SUMMARY = "Convert footnotes to endnotes"
DESCRIPTION = "Defines macros \\makeendnotes, which converts \\footnote to \
produce endnotes; and \\theendnotes which prints them out."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-fn2end-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "e04bdc428a957723613d1ca4a9b9a31ee94c0f5c3d21a57d1cd14ecb55d80168738b34d0e1346c10ca7fc673de47d2fa1b8b66e1097d1593ed267cf50db193b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fn2end.sty) texlive-fn2end"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
