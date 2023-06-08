SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python39-caldav-0.10.0-1.3.noarch.rpm"
RPM_HASH = "20d432d94b88d3a35e66ad4a0a031f2660644080fdfd2a835fd83bef519faff0ce1853da923702df3de440fbc67edd51654411f442c46a21f4e542d7a0451106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(caldav) python39-caldav python3dist(caldav)"
RDEPENDS:${PN} += "python(abi) python39-lxml python39-requests python39-vobject"

inherit rpm
