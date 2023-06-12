SUMMARY = "Show changes since the last save"
DESCRIPTION = "Show changes made to current buffer since the last save. This plugin is based \
from an example in the Hacking Vim book. The differences are that this \
functionality is in the form of a plugin, is a bit more robust, and can be \
toggled."
LICENSE = "Vim"

PV = "0.6+g346dae2"

RPM_NAME = "vim-plugin-diffchanges-0.6+g346dae2-55.1.noarch.rpm"
RPM_HASH = "9c1b3ebff281930812e2b4d9a736fc783eee74c16ff3fe2f76c9c705b747fc4bce884ceb8a8322ce9c720c28b8fac601f8d574a566f10021786b70b7268e598b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-diffchanges"
RDEPENDS:${PN} += "/bin/sh \
diffutils \
vim"

inherit rpm
