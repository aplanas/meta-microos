SUMMARY = "A bash wrapper for pdfTeX limiting its output to relevant errors"
DESCRIPTION = "This package provides a bash script aiming at reducing pdfTeX's \
output to relevant errors, which are displayed in a red bold \
font. The project originally started as a TeX StackExchange \
answer."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.0svn49169"

RPM_NAME = "texlive-pdftex-quiet-2023.201.1.1.0svn49169-51.1.noarch.rpm"
RPM_HASH = "202426550d9e72df98fcfb8438afbb325be1ba4c9d234ae032a22fc18dabf44289715d426bc1d271a30dd4b02cdbf1a3e51cd838d7fa6fec7bf0bb9897268493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftex-quiet"
RDEPENDS:${PN} += "/bin/bash /bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-pdftex-quiet-bin texlive-scripts texlive-scripts-bin"

inherit rpm
