SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-mutt-ics-0.9.2-3.11.noarch.rpm"
RPM_HASH = "2cf66732f11550d2a0a1d288550b198399b367c1160f49a6aa2948b6d88759608d0d18bebd99a24dd79aaa00153e9e5311120320d4d328accaf58e7a2feb0c07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics mutt_ics python3.11dist(mutt-ics) python311-mutt-ics python3dist(mutt-ics)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-icalendar python311-setuptools update-alternatives"

inherit rpm
