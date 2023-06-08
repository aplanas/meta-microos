SUMMARY = "VIM Table Mode for instant table creation."
DESCRIPTION = "An awesome automatic table creator & formatter allowing one to \
create neat tables as you type."
LICENSE = "MIT"

PV = "4.7.6.1"

RPM_NAME = "vim-plugin-table-mode-4.7.6.1-55.1.noarch.rpm"
RPM_HASH = "2cd28061e5dc356b4b870342fe8ffc2aef78772edb549ce8dd90f57297dce754d4888a784b211c3f3e935e195f9b92cf906fe4d3e692151475d47552c5d55bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-table-mode"
RDEPENDS:${PN} += "/bin/sh vim"

inherit rpm
