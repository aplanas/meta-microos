SUMMARY = "Vim plugins for LLVM"
DESCRIPTION = "This package contains vim plugins for LLVM like syntax highlighting."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-vim-plugins-14.0.6-9.1.noarch.rpm"
RPM_HASH = "7ea4522d0eb66e6adb4f6787751eb71f8e5cef23ad661c42368f19562f91abb1a4b5bfea0d93b8aeeb154ca24772d28b48a8a4faa1b62afcc2d1be892207a05a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-vim-plugins \
vim-plugin-llvm"
RDEPENDS:${PN} += ""

inherit rpm
