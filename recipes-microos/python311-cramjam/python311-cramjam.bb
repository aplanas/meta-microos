SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python311-cramjam-2.6.2-1.5.aarch64.rpm"
RPM_HASH = "f7048faad46a4ca24839a1fbe01547720734292ca30a7335509f6921f85701f5c08136a55174636596b76d9d888466d61e533b8f79988d6726cd8bb061121f41"

RPROVIDES:${PN} += "python3.11dist(cramjam) python311-cramjam python311-cramjam(aarch-64) python3dist(cramjam)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) python(abi)"

inherit rpm
