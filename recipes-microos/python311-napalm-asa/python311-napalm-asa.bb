SUMMARY = "NAPALM - Cisco ASA Driver network driver"
DESCRIPTION = "Cisco ASA Driver implementation for the NAPALM Network Automation Project. \
This driver makes use of the Cisco ASA REST API. The REST API is only \
available from software version 9.3.2 and up, and on the 5500-X series, \
ASAv, ASA on Firepower and ISA 3000 platforms."
LICENSE = "Apache-2.0"

PV = "20180525.8c54a85"

RPM_NAME = "python311-napalm-asa-20180525.8c54a85-1.3.noarch.rpm"
RPM_HASH = "d2b4311e690655f738a321009708d77ec42e6d9de49d5639ab318059448c3524ee395ae4dd0a132de19e290a579399c1c6a61a9094d28d2b13173392d4d1a95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(napalm-asa) python311-napalm-asa python3dist(napalm-asa)"
RDEPENDS:${PN} += "python(abi) python311-napalm"

inherit rpm
