SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for \
system linkers and runs much faster than them. It also provides features that \
are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "lld-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "38cb0a1eee23557298f585e75c6301f793318435add6196691cbacfae473a3afa6045a0aadbd4110e9d5e92e711d898647542ba90b7c22ddc55bdfae3b56934c"

RPROVIDES:${PN} += "lld \
lld(aarch-64)"
RDEPENDS:${PN} += "lld16"

inherit rpm
