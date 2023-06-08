SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-iso8601-1.1.0-2.1.noarch.rpm"
RPM_HASH = "03e7fd97b645082ce7aef4331adfeda8d0cc5109e1f3a9d2bce36ca1b538aa59fd6ab7dec870508551cd865f019a3bc50428738cc8728e9a4e6f78ca97e14e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso8601 python3.10dist(iso8601) python310-iso8601 python3dist(iso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
