SUMMARY = "Documentation for texlive-cd"
DESCRIPTION = "This package includes the documentation for texlive-cd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.4svn34452"

RPM_NAME = "texlive-cd-doc-2023.201.1.4svn34452-52.1.noarch.rpm"
RPM_HASH = "ab8322ecf904b04fc4e148a9342a6a2fa957ba317c3c8efdd6a03d0a72ad8c69d7f6dac22f25c5ff98a6c7c080b383dd7a6fe35934eac3db716f2206b110039c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-doc"
RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
