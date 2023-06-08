SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-doc that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-doc-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "b144f42d9ca1441ee79f7a7e9002f50f129b3da8c74994d3983cf24f1faf84b87ec4e97b6d3319d9f65442db4776e930151284dd4a2e2a63cba29df7ca0c74c7"

RPROVIDES:${PN} += "llvm-doc llvm-doc(aarch-64)"
RDEPENDS:${PN} += "llvm llvm16-doc"

inherit rpm
