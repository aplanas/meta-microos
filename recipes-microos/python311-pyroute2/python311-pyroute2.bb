SUMMARY = "Python Netlink library"
DESCRIPTION = "Pyroute2 is a pure Python netlink library. It requires only Python stdlib, no \
3rd party libraries. The library was started as an RTNL protocol \
implementation, so the name is pyroute2, but now it supports many netlink \
protocols. Some supported netlink families and protocols: \
 \
  * rtnl, network settings --- addresses, routes, traffic controls \
  * nfnetlink --- netfilter API: ipset, nftables, ... \
  * ipq --- simplest userspace packet filtering, iptables QUEUE target \
  * devlink --- manage and monitor devlink-enabled hardware \
  * generic --- generic netlink families \
  * nl80211 --- wireless functions API (basic support) \
  * taskstats --- extended process statistics \
  * acpi_events --- ACPI events monitoring \
  * thermal_events --- thermal events monitoring \
  * VFS_DQUOT --- disk quota events monitoring"
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.7.3"

RPM_NAME = "python311-pyroute2-0.7.3-1.4.noarch.rpm"
RPM_HASH = "8f16f0a6d5a233b01757379cc010e7dbeeb30e938f619039ffc81cee77904348c8b349a4ac730b6177aeb12844d68b1974346a3304e2960329adcdb173a9af55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyroute2) python311-pyroute2 python311-pyroute2.core python311-pyroute2.ethtool python311-pyroute2.ipdb python311-pyroute2.ipset python311-pyroute2.ndb python311-pyroute2.nftables python311-pyroute2.nslink python3dist(pyroute2)"
RDEPENDS:${PN} += "/usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
