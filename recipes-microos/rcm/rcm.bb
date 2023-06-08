SUMMARY = "An rc file (dotfile) management tool"
DESCRIPTION = "The rcm suite of tools is for managing dotfiles directories. This is a \
directory containing all the .*rc files in your home directory (.zshrc, \
.vimrc, and so on). These files have gone by many names in history, \
such as “rc files” because they typically end in rc or “dotfiles” \
because they begin with a period."
LICENSE = "BSD-3-Clause"

PV = "1.3.6"

RPM_NAME = "rcm-1.3.6-1.2.noarch.rpm"
RPM_HASH = "14881422bf026cae1092331fc5258e80aca2083094feb929d599e13c30cf9ea3ca5c5d9f0d5a5cc44890d11c05970f24950e2b2cd85c2685ec64e1bcabfc58df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rcm"
RDEPENDS:${PN} += "/usr/bin/bash bash"

inherit rpm
