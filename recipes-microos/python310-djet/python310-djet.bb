SUMMARY = "Set of helpers for easy testing of Django apps"
DESCRIPTION = "Set of helpers for easy testing of Django apps."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-djet-0.3.0-2.3.noarch.rpm"
RPM_HASH = "1282ad7da7b8f332d713e1eaa85b836d9438ab262f9987d5fd025015c265bc4d0eb47f7ebf1229f9102785bb21d2e63be44b182c1fbfead3247cf56605157802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-djet python3.10dist(djet) python310-djet python3dist(djet)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-Pillow python310-six"

inherit rpm
