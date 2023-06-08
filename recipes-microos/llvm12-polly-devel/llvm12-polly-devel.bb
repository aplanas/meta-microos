SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-polly-devel-12.0.1-11.1.aarch64.rpm"
RPM_HASH = "c3be5de05f4a68342c1c064188e9161b7c7680a6b2b3999a3dffdb8acea4a0ef90feba4679404fcd695af9558456d5c7198f11f5a1dfc1882245a2e9deee135a"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm12-polly-devel llvm12-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm12-polly"

inherit rpm
