SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "python3-clang16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "c9bd90449376051ae67cdd45fef13fc6bef6c32631382e2263aee186ea062c0ef43ab2fc4cad5729ed63a3460b50d9577ee84b38e72dcd74ccca62b0c0eb7d4b"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ python3-clang16 python3-clang16(aarch-64)"
RDEPENDS:${PN} += "libclang13 python(abi) python3-base"

inherit rpm
