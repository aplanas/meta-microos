SUMMARY = "Fugitive plugin for Vim"
DESCRIPTION = "Provides git integration with vim."
LICENSE = "Vim"

PV = "3.7"

RPM_NAME = "vim-plugin-fugitive-3.7-55.1.noarch.rpm"
RPM_HASH = "179d239ad2b07a0bb91fcfd637b016beec45f2d530329ab6bab1dd175e8c1da7a143327081088d3ffd9532a3d426f35c78cb742413909659f965809ed8ba2665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-fugitive"
RDEPENDS:${PN} += "/bin/sh git-core"

inherit rpm
