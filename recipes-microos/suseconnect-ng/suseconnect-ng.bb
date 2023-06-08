SUMMARY = "Utility to register a system with the SUSE Customer Center"
DESCRIPTION = "This package provides a command line tool for connecting a \
client system to the SUSE Customer Center. It will connect the system to your \
product subscriptions and enable the product repositories/services locally. \
suseconnect-ng reduces the size of its runtime dependencies compared to the \
replaced SUSEConnect."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "suseconnect-ng-1.1.0~git0.e3c41e60892e-1.1.aarch64.rpm"
RPM_HASH = "ee1f5f0253ae326c85b192ec227a3315d541756999bc4bb3aed339469a3c561cb5512030ccaa793493000e366ee641165ed881ef888fdb01f9d46cfefed176ca"

RPROVIDES:${PN} += "SUSEConnect suseconnect-ng suseconnect-ng(aarch-64) zypper-migration-plugin zypper-search-packages-plugin"
RDEPENDS:${PN} += "/bin/sh ca-certificates-mozilla coreutils dmidecode util-linux zypper"

inherit rpm
