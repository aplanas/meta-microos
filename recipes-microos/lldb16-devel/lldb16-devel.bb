SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "lldb16-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "c65c25dd2cf6e95a913fb7bc6c37d237847f989ddbe358a0d5f81e91de3188b25de7a1eec97bd3983f18575db8ae976634f84ba4ae84219e1db8c9ebc7859366"

RPROVIDES:${PN} += "lldb-devel-provider lldb16-devel lldb16-devel(aarch-64)"
RDEPENDS:${PN} += "clang16-devel liblldb16 llvm16-devel pkgconfig(libedit) pkgconfig(libxml-2.0)"

inherit rpm
