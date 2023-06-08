SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-vim-plugins-12.0.1-11.1.noarch.rpm"
RPM_HASH = "9fc2928434bd39c0af717317e7dd049155d084a72b3646cb5e202acd3535c353810c70bff37794331e6b958f2865582fb506d6e61a2b961c3e90e9896a9c71f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm12-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
