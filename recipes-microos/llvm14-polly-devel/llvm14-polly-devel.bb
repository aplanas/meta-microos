SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-polly-devel-14.0.6-8.1.aarch64.rpm"
RPM_HASH = "d1262dc988468b8a56c97bcb9c67e649f21f648de83f85e074efa4f224b7916869d038d7a5aaeef939928d920d15e610deb9ea984b1205114800982b10ad11c3"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm14-polly-devel llvm14-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm14-devel llvm14-polly"

inherit rpm
