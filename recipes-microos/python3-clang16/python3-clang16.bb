SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "python3-clang16-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "bec4e8127cde684f8390a8b9671e0991c3b4aabf07554460053a9ac7f6bcb7aa2822d7de27e83fec5dbde3431185281c356c751f923e8095950c5e628fae7a96"

RPROVIDES:${PN} += "/usr/lib64/python3.10/site-packages/clang/ python3-clang16 python3-clang16(aarch-64)"
RDEPENDS:${PN} += "libclang13 python(abi) python3-base"

inherit rpm
