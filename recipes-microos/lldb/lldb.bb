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

PV = "16.0.4"

RPM_NAME = "lldb-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "01d773f5df507b88d95769cc342a3ed79408b10ac5a1b60aa95ca88cb9c698b488e6267b3851ce54b292c955ecf9e70961bdba75ce74c4b394e366565398f986"

RPROVIDES:${PN} += "lldb lldb(aarch-64)"
RDEPENDS:${PN} += "lldb16"

inherit rpm
