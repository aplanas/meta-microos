SUMMARY = "TCTI interface library for Microsoft software TPM2 simulator"
DESCRIPTION = "TPM Command Transmission Interface library for communicating using the \
protocol exposed by the Microsoft software TPM2 simulator."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-mssim0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "97414ca9462bb16dd8df4b967c61ce2d74a5648765af0c7353e451a19ae2c51dcaa17dd273c7a32d2d3f0783be7183f4d2e2375bf25e6b1ad03cd65b6ebafa0b"

RPROVIDES:${PN} += "libtss2-tcti-mssim.so.0()(64bit) libtss2-tcti-mssim0 libtss2-tcti-mssim0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtss2-mu.so.0()(64bit)"

inherit rpm
