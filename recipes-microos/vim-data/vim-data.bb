SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.0.1572"

RPM_NAME = "vim-data-9.0.1572-1.1.noarch.rpm"
RPM_HASH = "bc14c3237bac6537291cb364dd975d415f60f9d9462d02a1a65b30ae42e5b90ff02047945597a067698281009dca3a25b26ee03f0234081d7859fab9af23e345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data vim-plugin-matchit vim-plugin-nginx"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk /usr/bin/perl vim-data-common"

inherit rpm
