SUMMARY = "Vim plugin for fzf"
DESCRIPTION = "Plugin for vim allowing use of fzf."
LICENSE = "MIT"

PV = "0.40.0"

RPM_NAME = "vim-fzf-0.40.0-1.1.noarch.rpm"
RPM_HASH = "5fa7eb1c42e2599a314bc8eac88cfeb5829d5cd1f81ce51db256cee53554e5593308cedc760e43d484539dfeaa07ae1094b8beea6c3f34ee50489e6a3d3a3302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-fzf"
RDEPENDS:${PN} += "(vim or neovim)"

inherit rpm
