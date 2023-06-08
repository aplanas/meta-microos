SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python39-django-nine-0.2.7-1.4.noarch.rpm"
RPM_HASH = "d37616a49f8f590b48b195ef7d03bd8d36084b39b81836cf1accf4c282378cbe3ef0022e490baeae7ff0ff22368e73d31b5ca525bd93b7a5c04780e627d75b00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-nine) python39-django-nine python3dist(django-nine)"
RDEPENDS:${PN} += "python(abi) python39-packaging"

inherit rpm
