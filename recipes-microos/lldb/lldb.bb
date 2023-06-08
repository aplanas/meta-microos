SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler. \
 \
This package is a dummy package that depends on the version of \
lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "lldb-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "f55372c7434fa93aa57a6f8047794a45b8c20061f5e557078756f7246e042246fa1586da7251ce6b7c73c0f78ad74acaa76bc4b8fcf3dead7c976b4636108a77"

RPROVIDES:${PN} += "lldb lldb(aarch-64)"
RDEPENDS:${PN} += "lldb16"

inherit rpm
