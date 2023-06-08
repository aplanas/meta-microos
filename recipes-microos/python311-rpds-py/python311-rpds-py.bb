SUMMARY = "Python bindings to Rust's persistent data structures (rpds)"
DESCRIPTION = "Python bindings to Rust's persistent data structures (rpds)"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-rpds-py-0.7.1-1.2.aarch64.rpm"
RPM_HASH = "ccc9cc549e14a91dab82ace4a92bd72ea233081b8e020a6d6ba62bc301b2d46cbb490e8725264a77ce12f4f6aafa73ea6b7a6b2ac2344803e540fae2246c5475"

RPROVIDES:${PN} += "python3.11dist(rpds-py) python311-rpds-py python311-rpds-py(aarch-64) python3dist(rpds-py)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) python(abi)"

inherit rpm
