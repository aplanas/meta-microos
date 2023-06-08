SUMMARY = "A language for matching/validating/filtering Python dictionaries"
DESCRIPTION = "The kmatch library provides a language for matching Python \
dictionaries. Patterns are specified as lists of filters combined \
with logical operators."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-kmatch-0.4.0-2.3.noarch.rpm"
RPM_HASH = "02df12b20ad0f2271b6532dacbc4ce070cd74875d5c1b9d8c5d719a9a148f2119e8a9b893467df238fe75962e00ac56cb90ee9fda0540c57b9625c563d55d07b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(kmatch) python311-kmatch python3dist(kmatch)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
