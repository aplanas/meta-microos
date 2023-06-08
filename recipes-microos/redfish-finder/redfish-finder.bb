SUMMARY = "Utility for parsing smbios information and configuring canonical bmc access"
DESCRIPTION = "Scans Smbios information for type 42 management controller information, and uses \
that to configure the appropriate network interface so that the bmc is \
canonically accessible via the hostname redfish-localhost"
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "redfish-finder-0.4-4.5.noarch.rpm"
RPM_HASH = "7fefb8bbb99479211d5183c1e1119b88fde25e3a4e955989063d2c9c9c48b977972c8e9d706ceb88b4ea00ed65c483adfe2cef029522547ec387084802e4d5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redfish-finder"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 NetworkManager dmidecode python3"

inherit rpm
