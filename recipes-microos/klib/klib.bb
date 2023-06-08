SUMMARY = "C library with utility functions"
DESCRIPTION = "Klib is a C library that provides data types like hashes, search \
trees, AVL trees, sorting functions, a dynamic array type, a \
singly-linked list and memory pool, various numeric routines and a \
command-line argument parser."
LICENSE = "MIT"

PV = "1.0~git.20210716"

RPM_NAME = "klib-1.0~git.20210716-1.2.noarch.rpm"
RPM_HASH = "2550555b6feadcce1a7a35a07de183028f70766ab083b75091ec90afdcc2cb9f8b86cc5c5bb1bf9c7dfb16dd5f34b2db93d8c178e2f0ba06d80af60f88afef3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klib"
RDEPENDS:${PN} += ""

inherit rpm
