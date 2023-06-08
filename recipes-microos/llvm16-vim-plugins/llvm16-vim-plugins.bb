SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "llvm16-vim-plugins-16.0.2-1.1.noarch.rpm"
RPM_HASH = "2b129b5a2aa982096d76a09e7323d8033d1902004c1acc03af2dea5fb14ba1d570927ab53a66c3d14794cc3357d5b003ab22cc5a503a10894052af1e2b94c6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
