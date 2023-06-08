SUMMARY = "Babel contrib support for Bosnian"
DESCRIPTION = "The package provides a language definition file that enables \
support of Bosnian with babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38174"

RPM_NAME = "texlive-babel-bosnian-2023.201.1.1svn38174-53.1.noarch.rpm"
RPM_HASH = "4dd17b5007fe4dd4ac3593d88c20dba4d768200b0559dbdcb608a415c1914207212c635582160179117471073305c04ae75298a858eb43f9f098d32de32c3b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bosnian.ldf) texlive-babel-bosnian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
