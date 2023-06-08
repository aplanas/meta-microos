SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp3-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "082573c189f4c879a7c278b5c9db0e8f508bc3365161de2931d588e965b1fc88a8318246bf10275832b8a1496ff811b55748668d0044b2780e1ff7217979a27d"

RPROVIDES:${PN} += "libpcp.so.3()(64bit) libpcp.so.3(PCP_3.0)(64bit) libpcp.so.3(PCP_3.1)(64bit) libpcp.so.3(PCP_3.10)(64bit) libpcp.so.3(PCP_3.11)(64bit) libpcp.so.3(PCP_3.12)(64bit) libpcp.so.3(PCP_3.13)(64bit) libpcp.so.3(PCP_3.14)(64bit) libpcp.so.3(PCP_3.15)(64bit) libpcp.so.3(PCP_3.16)(64bit) libpcp.so.3(PCP_3.17)(64bit) libpcp.so.3(PCP_3.18)(64bit) libpcp.so.3(PCP_3.19)(64bit) libpcp.so.3(PCP_3.2)(64bit) libpcp.so.3(PCP_3.20)(64bit) libpcp.so.3(PCP_3.21)(64bit) libpcp.so.3(PCP_3.22)(64bit) libpcp.so.3(PCP_3.23)(64bit) libpcp.so.3(PCP_3.24)(64bit) libpcp.so.3(PCP_3.25)(64bit) libpcp.so.3(PCP_3.26)(64bit) libpcp.so.3(PCP_3.27)(64bit) libpcp.so.3(PCP_3.28)(64bit) libpcp.so.3(PCP_3.29)(64bit) libpcp.so.3(PCP_3.3)(64bit) libpcp.so.3(PCP_3.30)(64bit) libpcp.so.3(PCP_3.4)(64bit) libpcp.so.3(PCP_3.5)(64bit) libpcp.so.3(PCP_3.6)(64bit) libpcp.so.3(PCP_3.7)(64bit) libpcp.so.3(PCP_3.8)(64bit) libpcp.so.3(PCP_3.9)(64bit) libpcp3 libpcp3(aarch-64) libpcp_pmda.so.3()(64bit) libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.10)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.11)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.2)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.3)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.4)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.5)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.6)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.7)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.8)(64bit) libpcp_pmda.so.3(PCP_PMDA_3.9)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.10)(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.4)(64bit) libnss3.so(NSS_3.5)(64bit) libnss3.so(NSS_3.6)(64bit) libsasl2.so.3()(64bit) libssl3.so()(64bit) libssl3.so(NSS_3.11.4)(64bit) libssl3.so(NSS_3.12.6)(64bit) libssl3.so(NSS_3.2)(64bit) libssl3.so(NSS_3.7.4)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) pcp-conf"

inherit rpm
