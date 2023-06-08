SUMMARY = "Documentation for texlive-songs"
DESCRIPTION = "This package includes the documentation for texlive-songs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1svn51494"

RPM_NAME = "texlive-songs-doc-2023.201.3.1svn51494-57.1.noarch.rpm"
RPM_HASH = "de4208d8065532fb1e7366b87b8f4c328c99d29eb33c587792303fc4721c80ccb5ca6dcff21e87921f4dd19c9876c2b3df3bd76593f167b16bd772aaa07a1185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songs-doc"
RDEPENDS:${PN} += ""

inherit rpm
