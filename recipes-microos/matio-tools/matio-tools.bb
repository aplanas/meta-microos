SUMMARY = "Command line tools for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.23"

RPM_NAME = "matio-tools-1.5.23-2.2.aarch64.rpm"
RPM_HASH = "1bcc38f46f6e393c00151415b3efa742188c8ce1b7f01607dca3c5a2487c19fab003a7c4bb204657dedb71e41b3a44b81b733710f51f053529f0ac10f0ca3437"

RPROVIDES:${PN} += "matio-tools \
matio-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5 \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmatio.so.11()(64bit) \
libmatio11"

inherit rpm
