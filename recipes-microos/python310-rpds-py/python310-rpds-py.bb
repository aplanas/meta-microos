SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python310-rpds-py-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "3bb538cca40c89c3d12fe7f188b45442b1eb941b809debda3ac8803651a0d20b744b838a908b45e4893e1f53086b134290b367e32e169337bcb8599b4b48e7c6"

RPROVIDES:${PN} += "python3-rpds-py python3.10dist(rpds-py) python310-rpds-py python310-rpds-py(aarch-64) python3dist(rpds-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
