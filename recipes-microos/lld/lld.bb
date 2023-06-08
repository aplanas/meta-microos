SUMMARY = "Linker for Clang/LLVM"
DESCRIPTION = "LLD is a linker from the LLVM project. That is a drop-in replacement for \
system linkers and runs much faster than them. It also provides features that \
are useful for toolchain developers."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "lld-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "2ef4fc416d06c8985bdf6129001bb412f7aab69cd75b260be94166c9ad35b9709b47b8106c76d470c164c938e7fa8235de372a36565f5fef20f83796c6d76eff"

RPROVIDES:${PN} += "lld lld(aarch-64)"
RDEPENDS:${PN} += "lld16"

inherit rpm
