SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python311-khal-0.10.5-3.4.noarch.rpm"
RPM_HASH = "6f6ad7e83646451ffa6b23b2d0bc79347a9fe9bc9edb8f65abca64b08048b7dea15a6485648221bb592ed172392d5f4190ea69c7591070033b1e668e436b0532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(khal) python311-khal python3dist(khal)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-atomicwrites python311-click python311-click-log python311-configobj python311-dateutil python311-icalendar python311-pytz python311-pyxdg python311-tzlocal python311-urwid update-alternatives"

inherit rpm
