SUMMARY = "A fast CSV toolkit written in Rust"
DESCRIPTION = "xsv is a command line program for indexing, slicing, analyzing, \
splitting and joining CSV files."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-0.13.0-2.8.aarch64.rpm"
RPM_HASH = "e545990b430dfc23cc90be0d843eb243f3a005038b0570763ec8aef2bca91c6c2103ba6ca3e5870921e59219c937b9875762f3718eaafa6d04ae75da03290427"

RPROVIDES:${PN} += "xsv xsv(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
