SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-vim-plugins-11.0.1-13.1.noarch.rpm"
RPM_HASH = "b5fbc807d2dee0be193b741038dcd22098b58832a3c0bbd562fdce248513fec4ecb469eee267c5e154c62a5a517e39dfb10dfa64d59bd54c797459f33ebdd075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm11-vim-plugins \
vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
