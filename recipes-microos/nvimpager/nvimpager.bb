SUMMARY = "Use nvim as a pager"
DESCRIPTION = "Using neovim as a pager to view man pages, git diffs, whatnot with neovim's syntax highlighting and mouse support."
LICENSE = "BSD-2-Clause"

PV = "0.11.0"

RPM_NAME = "nvimpager-0.11.0-1.2.noarch.rpm"
RPM_HASH = "6bca5cfa1a5861bda87be73c3177c03e0a0c7831d0a043ef8242e353b65d372e394affe23a7c17c458c8ef0b4d69a08d89da5497892a76a76d532a290711cbb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvimpager"
RDEPENDS:${PN} += "/bin/bash lua54 neovim"

inherit rpm
