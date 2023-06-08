SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-polly-devel-13.0.1-8.1.aarch64.rpm"
RPM_HASH = "bc02d83dd420351a361ab47ff2fb4e01b4a1ab500cd86a41268db10e6bc129c2db2e622f6d98dd1fef6a4c5cf2338f51b17ecadaecc49fab23ff9dabc4229f9c"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm13-polly-devel llvm13-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm13-devel llvm13-polly"

inherit rpm
