SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-vim-plugins-15.0.7-2.4.noarch.rpm"
RPM_HASH = "03d01b4e754359ec75374c4c56e122e113adcaeec0e66f9d2440cb4b7bdc6c38ba836dc497d54addd3d5c9a012228a7c2163a609b595434fd4fbcffb9451c783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm15-vim-plugins vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
