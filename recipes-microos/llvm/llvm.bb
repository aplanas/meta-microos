SUMMARY = "Low Level Virtual Machine"
DESCRIPTION = "LLVM is a compiler infrastructure designed for compile-time, \
link-time, runtime, and idle-time optimization of programs from \
arbitrary programming languages. \
 \
The compiler infrastructure includes mirror sets of programming \
tools as well as libraries with equivalent functionality. \
 \
This package is a dummy package that depends on the version of \
llvm that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "e00d74f604e4d3b2a97ced209c019778c14807cfce5d4744ccc8f27cdb7cbed62fb6b61f2bed864b6f59731e668d31a8cf8dfcd11fb75eb0226df692cea45998"

RPROVIDES:${PN} += "llvm llvm(aarch-64)"
RDEPENDS:${PN} += "llvm16"

inherit rpm
