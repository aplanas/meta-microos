SUMMARY = "Performance Co-Pilot archive tools for importing collectl data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing collectl data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-collectl2pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "ac552295b95743e7c45747c027ffe4cef0863540b302e0ceb0517b642114c47d208ca3d673d8857251877852f7ebf66885c8c2159cfc35df953248d406eff5d2"

RPROVIDES:${PN} += "pcp-import-collectl2pcp \
pcp-import-collectl2pcp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.2)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp_import.so.1()(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) \
libpcp_import.so.1(PCP_IMPORT_1.1)(64bit)"

inherit rpm
