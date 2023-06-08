SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "llvm16-polly-devel-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "bdb3a0f09af45e36f531203ab6edabc76eea73f2fa00aed300e2474ea925172509a7e06889a8c26ed502bbd3fc2992ff8a302cd1d11e023e52466e211ea71a26"

RPROVIDES:${PN} += "cmake(Polly) llvm-polly-devel-provider llvm16-polly-devel llvm16-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig llvm16-devel llvm16-polly"

inherit rpm
