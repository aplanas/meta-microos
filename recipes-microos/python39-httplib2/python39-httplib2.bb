SUMMARY = "A Python HTTP client library"
DESCRIPTION = "A comprehensive HTTP client library that supports many features \
left out of other HTTP libraries."
LICENSE = "Apache-2.0 & MIT & (GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later)"

PV = "0.22.0"

RPM_NAME = "python39-httplib2-0.22.0-1.2.noarch.rpm"
RPM_HASH = "655fe5977c493358b48efaf1d33da06102f94f3f115732e9153772da572699335c0b77a8e1ca737f9b94bc9ea26b76ca5d933b66d3244e49bb51fbd80afda219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httplib2) \
python39-httplib2 \
python3dist(httplib2)"
RDEPENDS:${PN} += "ca-certificates \
python(abi) \
python39-certifi \
python39-pyparsing"

inherit rpm
