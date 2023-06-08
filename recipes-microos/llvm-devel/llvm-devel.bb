SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-devel that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "37028f567b5af38e1e9272910b7468c2a192d084746ff1b70490c330fa1b46ecfa78d9276cec859c057cd377e8d01ffe563aae326fc2590f1534edbee08fc994"

RPROVIDES:${PN} += "llvm-LTO-devel llvm-devel llvm-devel(aarch-64)"
RDEPENDS:${PN} += "llvm-gold llvm16-devel"

inherit rpm
