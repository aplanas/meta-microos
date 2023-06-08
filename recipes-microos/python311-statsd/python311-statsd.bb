SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-statsd-3.3.0-3.5.noarch.rpm"
RPM_HASH = "84c965cd963cfbf2348ecaaa1354698584dfafb598e62ebf6e7533d049168451f52a35e6fac85e1556af6e3f0514ad89181d63ea4729270a90bc4a1662a00fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(statsd) python311-statsd python3dist(statsd)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
