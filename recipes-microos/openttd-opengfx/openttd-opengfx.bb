SUMMARY = "Default baseset graphics for OpenTTD"
DESCRIPTION = "OpenGFX is an open source graphics base set designed to be used by OpenTTD. \
 \
OpenGFX provides a set of free and open source base graphics, and aims to \
ensure the best possible out-of-the-box experience with OpenTTD."
LICENSE = "GPL-2.0-only"

PV = "7.1"

RPM_NAME = "openttd-opengfx-7.1-1.6.noarch.rpm"
RPM_HASH = "2f6b352560ad8b5c5b075dbe058541378d9d08646a4407be3db3420ec6d7e29d7cfd897adb96ea76b90aa046f621fc225b63af8591d2348a00675a0818327847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengfx openttd-opengfx"
RDEPENDS:${PN} += "openttd-data"

inherit rpm
