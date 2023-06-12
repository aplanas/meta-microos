SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-rpds-py-0.7.1-2.1.aarch64.rpm"
RPM_HASH = "c592b6f938249c860df44abfe6cc878dbd2efad5ad0938c6f520cd699374cff95bb3786c9e41ea5e04e3ffd926ddb0bd9cc48938bc490f4c745951791ea83756"

RPROVIDES:${PN} += "python3.9dist(rpds-py) python39-rpds-py python39-rpds-py(aarch-64) python3dist(rpds-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
