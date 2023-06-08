SUMMARY = "Python bindings for taskwarrior"
DESCRIPTION = "Python bindings for your taskwarrior database."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "python310-taskw-2.0.0-1.3.noarch.rpm"
RPM_HASH = "9f8e1ccd79adb58e0c70a2466d97ebf69fcc36f29a426eaab688f9710ff4c0719aa23a26dc08d416dfdc0e474fd74c8121e2ef6bf7e49ca77e9320e591d858a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-taskw python3.10dist(taskw) python310-taskw python3dist(taskw)"
RDEPENDS:${PN} += "python(abi) python310-kitchen python310-python-dateutil python310-pytz taskwarrior"

inherit rpm
