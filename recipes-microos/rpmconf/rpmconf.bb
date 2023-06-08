SUMMARY = "Tool to handle rpmnew and rpmsave files"
DESCRIPTION = "This tool search for .rpmnew, .rpmsave and .rpmorig files and ask \
you what to do with them: \
Keep current version, place back old version, watch the diff or merge."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.8"

RPM_NAME = "rpmconf-1.1.8-1.2.noarch.rpm"
RPM_HASH = "cceb97ce5bf0f2236bb6ea9cdc9d9bdb705591f681078fa2412c2c2648ad72b182a38b6c856567413c3c368ac0f197eba72742ab66d7bbeb5f6ea9718fcac83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmconf"
RDEPENDS:${PN} += "/usr/bin/python3 python3-rpm python3-rpmconf"

inherit rpm
