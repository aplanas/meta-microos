SUMMARY = "Django project fake data seeder"
DESCRIPTION = "A module to seed Django projects with fake data."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-django-seed-0.2.2-2.7.noarch.rpm"
RPM_HASH = "2e75e157aa3e49cdf7474053912bced26b393990ae9e9da4afd460bf36595fae07cc2d16cc552b96bb9d539708bae7a5708ce0b0a3e67285ec08ea7cadf999d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-seed) python311-django-seed python3dist(django-seed)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-Faker"

inherit rpm
