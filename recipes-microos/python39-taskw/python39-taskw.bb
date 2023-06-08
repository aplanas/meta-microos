SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python39-taskw-2.0.0-1.3.noarch.rpm"
RPM_HASH = "e0c40599a15dfadf13977f4c08d9c308bc4733372dd1c7d276328266b0e33aaab72a1437ae95b58bc3175101bbadeac41ddb5e816fa4b1a78be212172400ff65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(taskw) python39-taskw python3dist(taskw)"
RDEPENDS:${PN} += "python(abi) python39-kitchen python39-python-dateutil python39-pytz taskwarrior"

inherit rpm
