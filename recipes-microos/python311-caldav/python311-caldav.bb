SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python311-caldav-0.10.0-1.3.noarch.rpm"
RPM_HASH = "4fe49974763830b74db8f3037bf09c1ef145bb3f7d9aa9f86ac1589395575e652de25231d77d28887276939bb1edc103657e069ffb47858798077b7b2b4a9601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(caldav) \
python311-caldav \
python3dist(caldav)"
RDEPENDS:${PN} += "python(abi) \
python311-lxml \
python311-requests \
python311-vobject"

inherit rpm
