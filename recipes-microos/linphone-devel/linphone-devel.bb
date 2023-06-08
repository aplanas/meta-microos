SUMMARY = "Web Phone"
DESCRIPTION = "Devel package for linphone."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.5"

RPM_NAME = "linphone-devel-5.0.5-1.5.noarch.rpm"
RPM_HASH = "194be3af9bf9838343030a70766087fd64e754bd619956d5db325ff926e5d3361798d90543967ed46cec48945dd1cfdb4c65faff356fc93aa04088197e33192f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "linphone-devel"
RDEPENDS:${PN} += ""

inherit rpm
