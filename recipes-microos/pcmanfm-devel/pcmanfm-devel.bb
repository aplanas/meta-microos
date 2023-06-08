SUMMARY = "Development files for PCManFM"
DESCRIPTION = "Development files for PCManFM."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "pcmanfm-devel-1.3.2-2.7.aarch64.rpm"
RPM_HASH = "052aae1e5cea3e3c1d82bdbfe3ddcb00d4a4870290ed6c29469e836c8892b9a91189563c5d96e41b2e33d2ab77b248264c2c4fd5846a8c5a58d9609ba74a1186"

RPROVIDES:${PN} += "pcmanfm-devel pcmanfm-devel(aarch-64)"
RDEPENDS:${PN} += "gtk2-devel libfm-gtk4 libfm4 pcmanfm pkgconfig"

inherit rpm
