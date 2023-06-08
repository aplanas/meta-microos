SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-django-ipware-5.0.0-1.1.noarch.rpm"
RPM_HASH = "1bc2719ab3f6d29ed4f57034c647cf00e5fcb2809f04e97d0bc9c609383da6e5673aefafc3fbaba73f0e8a3973d2d98b75752722b0b681d846d1976b2f9e6632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ipware python3.10dist(django-ipware) python310-django-ipware python3dist(django-ipware)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
