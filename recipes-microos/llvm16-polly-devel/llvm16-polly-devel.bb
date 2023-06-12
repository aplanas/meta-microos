SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-polly-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "397d8141a8aa792c97b4ed349662704b349d942626f2e0bbe96b450b5cd5718f82c2732b36f741d48b0239f261204be8db9487cd802c93043b2312414043d74a"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm16-polly-devel llvm16-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm16-devel llvm16-polly"

inherit rpm
