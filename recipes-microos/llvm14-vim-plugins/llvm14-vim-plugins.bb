SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-vim-plugins-14.0.6-8.1.noarch.rpm"
RPM_HASH = "5d908d378b6ccbe387e713c2f9f81ee4b0e0eb218cd42a301c1ea2a05797b7ec735c0463e82bb18c92e4fb473ed665f80f2144339148e60da7178c639d057eb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
