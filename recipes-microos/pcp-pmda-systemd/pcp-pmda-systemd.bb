SUMMARY = "Performance Co-Pilot (PCP) metrics from the Systemd journal"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from the Systemd journal."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-systemd-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "804a65d44fedac1a74adee01cd54f568ec336042aff77966a9799868c0d1fee3c33f7aa085fbfa9d3f3621dd3e7a18c4392175ef114cfce55292cb0b37ca0ea7"

RPROVIDES:${PN} += "pcp-pmda-systemd pcp-pmda-systemd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.21)(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp_pmda.so.3()(64bit) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
