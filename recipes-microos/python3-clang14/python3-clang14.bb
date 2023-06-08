SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "python3-clang14-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "d6eac9f734a5ddb637eccd67d7695187810869bf0fe82e961fd545fa5729cd9a2f4467c12926806e916c9cd2a3f63cf11ec42a0334b9e20dc02b27d9cfad79d1"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ python3-clang14 python3-clang14(aarch-64)"
RDEPENDS:${PN} += "libclang13 python(abi) python3-base"

inherit rpm
