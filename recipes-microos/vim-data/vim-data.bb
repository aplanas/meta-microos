SUMMARY = "Data files needed for extended vim functionality"
DESCRIPTION = "This package contains optional runtime & syntax files for vim."
LICENSE = "Vim"

PV = "9.0.1504"

RPM_NAME = "vim-data-9.0.1504-1.1.noarch.rpm"
RPM_HASH = "117a0b0bd9b39d7affd85712e943354e1cf06a60a18b3f2bf59ad9151da9c71a6c63f421ac45815ee91b5c0151e0639e11a7dee4cc37c66756eb017d3f70b6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-data vim-plugin-matchit vim-plugin-nginx"
RDEPENDS:${PN} += "/bin/sh /usr/bin/awk /usr/bin/perl vim-data-common"

inherit rpm
