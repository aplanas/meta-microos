SUMMARY = "Indicator shared files"
DESCRIPTION = "A package that has files needed to work with the indicators. This \
includes the systemd indicators-pre.target."
LICENSE = "GPL-3.0-only"

PV = "16.10.0+bzr20171205"

RPM_NAME = "indicator-common-16.10.0+bzr20171205-4.15.aarch64.rpm"
RPM_HASH = "5b879f4c83323830d8bbec87330665c78dd7ef4bd6de88806e4fcdb210e7cfb495a0d6ac0a34fbf539219f7f490227754d23bc9d4f8e61dfa7be3cbbb93be3ba"

RPROVIDES:${PN} += "indicator-common indicator-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
