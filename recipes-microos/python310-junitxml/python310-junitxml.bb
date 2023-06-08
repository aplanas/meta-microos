SUMMARY = "A pyunit extension to output JUnit compatible XML"
DESCRIPTION = "A Python unittest TestResult that outputs JUnit compatible XML."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "python310-junitxml-0.7-4.7.noarch.rpm"
RPM_HASH = "82216e2caef986a2a82bef514714fcb8f64d7286d1ad4bd05678ce4fefd638de1a024e838bcf3204642200405e63a3753ea9b7207ec5209e63fe71042b62e455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-junitxml python3.10dist(junitxml) python310-junitxml python3dist(junitxml)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi)"

inherit rpm
