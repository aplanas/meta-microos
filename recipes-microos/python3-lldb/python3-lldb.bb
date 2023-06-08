SUMMARY = "Python bindings for liblldb"
DESCRIPTION = "This package contains the Python bindings to clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
python3-lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "python3-lldb-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "74e1c75a424394d0045eba755200dab18f456f317c2126c2554e89fa92f649fdc944846e2d90671943478323ce7461e7ba352b8af47b5835f8d027a8ed36ade8"

RPROVIDES:${PN} += "python3-lldb python3-lldb(aarch-64)"
RDEPENDS:${PN} += "python3-lldb16"

inherit rpm
