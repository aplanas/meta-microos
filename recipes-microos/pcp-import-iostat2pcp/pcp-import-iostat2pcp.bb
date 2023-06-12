SUMMARY = "Performance Co-Pilot archive tools for importing iostat data"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for importing iostat data \
into standard PCP archive logs for replay with any PCP monitoring tool."
LICENSE = "LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-import-iostat2pcp-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "8dcc9cad025b249c9454b562091b3eb74bf138d5c344fc49de184c991dffa025e096874f55e53c0e9b041bc3cca0348331a92d96b674d09af78ebfcef5dc3eba"

RPROVIDES:${PN} += "pcp-import-iostat2pcp \
pcp-import-iostat2pcp(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
perl-PCP-LogImport \
sysstat"

inherit rpm
