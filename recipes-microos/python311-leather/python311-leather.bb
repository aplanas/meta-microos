SUMMARY = "Python charting for 80% of humans"
DESCRIPTION = "Leather is the Python charting library for those who need charts *now* \
and don't care if they're perfect."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-leather-0.3.4-2.1.noarch.rpm"
RPM_HASH = "2ea61f3afbdb5187c7b57398d30a636dbc3eba165a566246f6fb04800debde5cfd3b553374ce2df534f9953a315b64831e9be353d45183fb65cb59fddfc55b97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(leather) python311-leather python3dist(leather)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
