SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-polly-devel-11.0.1-12.1.aarch64.rpm"
RPM_HASH = "a925a02c31ff0ffeafafbd0e37da434e1c733a5ac664e29ae6960ddb0071bcdd6e2e7a55999565195d9a34937648c41f37b9612bc75a2c55c48de4123b2d142c"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm11-polly-devel llvm11-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm11-polly"

inherit rpm
