SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python310-django-localflavor-4.0-1.1.noarch.rpm"
RPM_HASH = "f937629602d6fb0ae1125b1f3ee8858d72f8a1ea5b28e5261fc9bac0ac3287e6f8ae9d2156225e6daa7d2d94f4f9eee1b4ffcd89142d419a983ac43450677c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-localflavor python3.10dist(django-localflavor) python310-django-localflavor python3dist(django-localflavor)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-python-stdnum"

inherit rpm
