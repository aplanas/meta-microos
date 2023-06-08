SUMMARY = "SNMP configuration to include the BMC's SNMP agent"
DESCRIPTION = "Given a host with BMC, this package would extend system configuration \
of net-snmp to include redirections to BMC based SNMP."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.0.g19d7878"

RPM_NAME = "ipmitool-bmc-snmp-proxy-1.8.19.0.g19d7878-1.4.noarch.rpm"
RPM_HASH = "e0a1aacd7fd9e49a32e7653dde03511df23117e34d2c77029626d1e19b16cdfd94e19820f86f6d4a36d77162e8f5f04ff4114820206eb10e7b79cbdfc6afcd79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(ipmitool-bmc-snmp-proxy) ipmitool-bmc-snmp-proxy"
RDEPENDS:${PN} += "/bin/sh ipmitool net-snmp"

inherit rpm
