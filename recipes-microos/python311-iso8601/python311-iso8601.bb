SUMMARY = "Python module to parse ISO 8601 dates"
DESCRIPTION = "This module parses the most common forms of ISO 8601 date strings (e.g. \
2007-01-14T20:34:22+00:00) into datetime objects."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-iso8601-1.1.0-2.1.noarch.rpm"
RPM_HASH = "62d657ca936765b90b052112d19d00320046826013d6ecdc53d919dcf8b726fd1f3b08f544db25c4557808858cb1527c119ea1962b6eb1b2dd05679ac5b21d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(iso8601) python311-iso8601 python3dist(iso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
