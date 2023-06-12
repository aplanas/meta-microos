SUMMARY = "Development files for Polly"
DESCRIPTION = "This package contains the development files for Polly."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-polly-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "553a7a530acbbd10864d2a556ecb4eee91ac58f6aa50a628cbd39a21da08424cb084b3a0e557fe29d2c0bc4c698e1c489be0995928590f240277789cc92a0529"

RPROVIDES:${PN} += "cmake(Polly) \
llvm-polly-devel-provider \
llvm14-polly-devel \
llvm14-polly-devel(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
llvm14-devel \
llvm14-polly"

inherit rpm
