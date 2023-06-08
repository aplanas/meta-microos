SUMMARY = "Development files for klib"
DESCRIPTION = "Klib is a C library that provides data types like hashes, search \
trees, AVL trees, sorting functions, a dynamic array type, a \
singly-linked list and memory pool, various numeric routines and a \
command-line argument parser. \
 \
To use a component of this library, files need to be copied to the \
source code tree where it is supposed to be used."
LICENSE = "MIT"

PV = "1.0~git.20210716"

RPM_NAME = "klib-devel-1.0~git.20210716-1.2.noarch.rpm"
RPM_HASH = "3d3ca0fd7d419c638ed6852655455a215d462603d55ba80d6960477a54b0373ef86301d502d57ac4effda0a1ed6d31e3e0a4c25df736c0e67c897eab96ed7d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klib-devel"
RDEPENDS:${PN} += "klib"

inherit rpm
