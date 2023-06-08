SUMMARY = "Letters to multiple recipients"
DESCRIPTION = "A package for multiple letters from the same basic source; the \
package offers parametrisation of the letters actually sent."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn21480"

RPM_NAME = "texlive-formlett-2023.201.2.3svn21480-52.1.noarch.rpm"
RPM_HASH = "ef2184036b1596a7694de962fdc783cd94716154153fbca894ea76f8f82414718053ff056b828e60f8834b2cbaf7ba8e4a55855ccb2cf488af86ec0c064f1823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(formlett.sty) texlive-formlett"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
