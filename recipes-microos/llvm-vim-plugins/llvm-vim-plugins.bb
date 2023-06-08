SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting. \
 \
This package is a dummy package that depends on the version of \
llvm-vim-plugins that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-vim-plugins-16.0.2-1.1.noarch.rpm"
RPM_HASH = "d8608ec072c98a67d0dd7802b004970319ad0e2a9ab7b9c5ecde64c40a8e35912da01891b284c4f086af7aca97af4e9cefc7e8f74e64840443f5645e8b123d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-vim-plugins"
RDEPENDS:${PN} += "llvm16-vim-plugins"

inherit rpm
