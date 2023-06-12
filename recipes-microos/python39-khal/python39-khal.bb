SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python39-khal-0.10.5-3.4.noarch.rpm"
RPM_HASH = "bc9cadc51a2bd31a29d14503bb609919930baeeee79d4197379edfada54ffca27a36729c3359cfc89c477d54ca2e364091341b65493b9ec88e4f71d08f30ed5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(khal) \
python39-khal \
python3dist(khal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-atomicwrites \
python39-click \
python39-click-log \
python39-configobj \
python39-dateutil \
python39-icalendar \
python39-pytz \
python39-pyxdg \
python39-tzlocal \
python39-urwid \
update-alternatives"

inherit rpm
