SUMMARY = "Easy insert mode completion with Tab key"
DESCRIPTION = "This script allows you to use the tab key to do all your insert completion."
LICENSE = "BSD-3-Clause"

PV = "2.1"

RPM_NAME = "vim-plugin-supertab-2.1-55.1.noarch.rpm"
RPM_HASH = "9835df7b399d3f8ad3fed2aa1d8e5e37c3e7cb9078564fbd972101aacbf44d483c6e50fb1eebd3742c679f7e4d48ca6881ec2b24301ca0dabfd0b942ec5c7bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-supertab"
RDEPENDS:${PN} += "/bin/sh vim"

inherit rpm
