SUMMARY = "Jinja2 Extension for Dates and Times"
DESCRIPTION = "A Jinja2 extension providing support for dates and times."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-jinja2-time-0.2.0-3.14.noarch.rpm"
RPM_HASH = "35c8fcc93e06317a8e93c4fae31113c52bbc1564eaa3a2153c74c29b4f530537f977520423f9dad55efce4f3ab13e3ef0ff7fbe525aff073869257e48e16a88d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jinja2-time) python39-jinja2-time python3dist(jinja2-time)"
RDEPENDS:${PN} += "python(abi) python39-Jinja2 python39-arrow"

inherit rpm
