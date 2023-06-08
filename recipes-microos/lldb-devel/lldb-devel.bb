SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB. \
 \
This package is a dummy package that depends on the version of \
lldb-devel that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "lldb-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "5e24b39043a2a33f1af44cfdebc28b462c7bcbb8a16805f8dc9d19d04255bd9aedadc229e8c83d46cb71ef1f402176222747eced89c57bedc3bb75767afd8439"

RPROVIDES:${PN} += "lldb-devel lldb-devel(aarch-64)"
RDEPENDS:${PN} += "lldb16-devel"

inherit rpm
