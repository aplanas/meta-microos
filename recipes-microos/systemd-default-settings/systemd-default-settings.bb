SUMMARY = "Customization of systemd default settings for SUSE distributions"
DESCRIPTION = "This package overrides some of the upstream default settings which are \
better suited for openSUSE or SLE distributions. \
 \
This package should not be installed alone but is supposed to be \
pulled in by the branding package instead."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "systemd-default-settings-0.7-2.6.noarch.rpm"
RPM_HASH = "8b3b1dfe003b9f8cf946ec70f912bc7766811c1cbb14f31ad269125668de8d2dfcf3d8848560d8f0b95e9ee3cf04c9227a889b5da2cb927a80ad2ffd1bedb1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-default-settings"
RDEPENDS:${PN} += "/bin/sh systemd-default-settings-branding"

inherit rpm
