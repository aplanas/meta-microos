SUMMARY = "File listing as a tree"
DESCRIPTION = "Tree is a recursive directory listing command that produces a depth \
indented listing of files, which is colorized ala dircolors if the \
LS_COLORS environment variable is set and output is to tty."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.0"

RPM_NAME = "tree-2.1.0-1.3.aarch64.rpm"
RPM_HASH = "967381b26570ef37b9f324a0b42ce7f9837983e35f137a1a47309066a45851c2a4b1c023342298482e26d4b01d888a0ea5f820bba88e948b679433bb79aeb48e"

RPROVIDES:${PN} += "tree \
tree(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
