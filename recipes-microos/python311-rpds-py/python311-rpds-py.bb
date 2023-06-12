SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-rpds-py-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "c42203d4c6cff6ba0479dfc5630bdbbc586967659b4b3e9fef32b7d7f15f023a61ceb53e50ec27ce02d3c00eb9508c771b87d73c5ee8149ef4f6ac146995fb6a"

RPROVIDES:${PN} += "python3.11dist(rpds-py) python311-rpds-py python311-rpds-py(aarch-64) python3dist(rpds-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
