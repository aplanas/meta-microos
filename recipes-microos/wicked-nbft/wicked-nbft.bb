SUMMARY = "Network configuration infrastructure - nbft support"
DESCRIPTION = "This package provides an extension to retrieve the NBFT firmware \
network interface configuration according to the NVM Express Boot \
Specification 1.0 and convert it to wicked configuration."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.72"

RPM_NAME = "wicked-nbft-0.6.72-2.3.aarch64.rpm"
RPM_HASH = "1a75d7c9f6a014fe706e0b49690738aac0ceb865c32ff4ec2af9c98306ab4bc21262ee0c915915a187011a8cd2f19493cf6e5070a0c02e9eca548bb08473800e"

RPROVIDES:${PN} += "config(wicked-nbft) wicked-nbft wicked-nbft(aarch-64)"
RDEPENDS:${PN} += "/bin/bash jq nvme-cli wicked"

inherit rpm
