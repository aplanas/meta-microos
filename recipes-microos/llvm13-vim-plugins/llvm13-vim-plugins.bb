SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-vim-plugins-13.0.1-8.1.noarch.rpm"
RPM_HASH = "8b76d84d34a07726468e14f9deae4b339a1a119faad73b73955f18f3aafe640753f0402588a6beba234089dc5fe575ae0d8359c7c6c1ad91cece943432be6df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
