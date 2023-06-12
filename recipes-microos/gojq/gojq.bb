SUMMARY = "Pure Go implementation of jq"
DESCRIPTION = "Pure Go implementation of jq."
LICENSE = "MIT"

PV = "0.12.13"

RPM_NAME = "gojq-0.12.13-1.1.aarch64.rpm"
RPM_HASH = "6ebcff1002a4b53e905716d1dedff3bf9603d9a5c8aad3940507f65c3cee86dbe6af0491a6a82e48511938fc2ea5861ce72fd6ddf89889e704d7f4b0aeaacaa4"

RPROVIDES:${PN} += "gojq gojq(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
