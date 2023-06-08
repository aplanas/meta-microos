SUMMARY = "Job scheduling module for Python"
DESCRIPTION = "An in-process scheduler for periodic jobs that uses the builder \
pattern for configuration. Schedule lets the user run Python functions \
(or any other callable) periodically at pre-determined intervals."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-schedule-1.1.0-3.6.noarch.rpm"
RPM_HASH = "ebdb4d77aeb8376238351cb43fae6840f3e70917897e155f95271783be5be5deacd5f2f7a12a0459818cde2fa73305705fa8fcd107bbf10c681f2f35ae8fe392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(schedule) python311-schedule python3dist(schedule)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
