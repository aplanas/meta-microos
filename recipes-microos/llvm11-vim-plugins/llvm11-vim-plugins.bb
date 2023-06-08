SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-vim-plugins-11.0.1-12.1.noarch.rpm"
RPM_HASH = "76dcbe96979b98d810a9e9a04db4369bc2099320d1e2b04798e7e9473218b76698059506634f25f8ca0a7b2f5a1ce646a01b8484944705aeae0bc6e2353f808a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm11-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
