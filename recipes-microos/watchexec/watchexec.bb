SUMMARY = "Watches a path and runs a command whenever it detects modifications."
DESCRIPTION = "A simple, standalone tool that watches a path and runs a command \
whenever it detects modifications."
LICENSE = "Apache-2.0"

PV = "1.22.2"

RPM_NAME = "watchexec-1.22.2-1.2.aarch64.rpm"
RPM_HASH = "ffc67fc3904e115b3d4ff8dc67757a510a580065ecd5aa739b4a61243de6aa3c563d2d7139fdc36f5a76eb89a768ae55ead24b584e2e8dd58e9fc0f68db280b9"

RPROVIDES:${PN} += "bundled(rust-crate:BROKEN) watchexec watchexec(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
