SUMMARY = "Performance Co-Pilot run-time tracing library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time tracing library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_trace2-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b97a353c0e9bb5b665c16a606911095f31a870952da25e73e23b1a39b34bdf417bd5dcee59cc8d906b320f5183518a1dd5c47c70ad411c2a64fc81717fd0bc6e"

RPROVIDES:${PN} += "libpcp_trace.so.2()(64bit) \
libpcp_trace.so.2(PCP_TRACE_2.0)(64bit) \
libpcp_trace2 \
libpcp_trace2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp.so.3(PCP_3.4)(64bit)"

inherit rpm
