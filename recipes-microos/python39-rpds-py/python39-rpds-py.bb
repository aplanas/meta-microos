SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-rpds-py-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "4ad72ae174e580b3e16bf0d71eb8f59ebe7fa724a93d45a6311ff8b596c2cc4aee1e3fff2e43ac5f4fa38eb7d76251b7cf4f948fa168fc88d58ecd10dee01f3d"

RPROVIDES:${PN} += "python3.9dist(rpds-py) python39-rpds-py python39-rpds-py(aarch-64) python3dist(rpds-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
