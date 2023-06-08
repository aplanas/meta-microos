SUMMARY = "KIWI - Core host system dependencies"
DESCRIPTION = "This metapackage installs the necessary system dependencies \
to run KIWI."
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-systemdeps-core-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "51f867de60013ef8dc0a0354968feb7d6629e5a7c3c22d2b8935472da277602f095541a7eeeb2f3292540decc856cc2c2612c386b31fa1ea68c3b188ba550788"

RPROVIDES:${PN} += "kiwi-image-tbz-requires kiwi-image:tbz kiwi-packagemanager:dnf kiwi-packagemanager:microdnf kiwi-packagemanager:yum kiwi-packagemanager:zypper kiwi-systemdeps-core kiwi-systemdeps-core(aarch-64)"
RDEPENDS:${PN} += "dnf kiwi-tools lsof microdnf mtools openssl rsync tar zypper"

inherit rpm
