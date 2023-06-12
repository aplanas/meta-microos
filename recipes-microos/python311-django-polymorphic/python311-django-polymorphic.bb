SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python311-django-polymorphic-3.1-2.6.noarch.rpm"
RPM_HASH = "5b99d116d276a951169e2c9df1d631ce00bd80a3090cfbfa2f337dd636f8146ceba469def1fa4e6c4b628f41a0394005f11f141ef6490c15ec95161ac882b75a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-polymorphic) \
python311-django-polymorphic \
python3dist(django-polymorphic)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
