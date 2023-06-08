SUMMARY = "C++ header files and library symbolic links for crc32c"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for libcrc32c. If you would like to develop programs using libcrc32c, \
you will need to install libcrc32c-devel."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c-devel-1.1.2-1.4.aarch64.rpm"
RPM_HASH = "a99d3700f4fcc047dffd59ba843f7c1fb08bc5b680a4b22012db5570ae79cb81a03fc1be47d9ad38e2967b9106eeb581118049c68283c6c0300ec31ed92921b4"

RPROVIDES:${PN} += "cmake(Crc32c) libcrc32c-devel libcrc32c-devel(aarch-64)"
RDEPENDS:${PN} += "libcrc32c1"

inherit rpm
