SUMMARY = "Support for many storage backends in Django"
DESCRIPTION = "django-storages is a project to provide a variety of storage backends in a single library."
LICENSE = "BSD-3-Clause"

PV = "1.13.2"

RPM_NAME = "python39-django-storages-1.13.2-1.3.noarch.rpm"
RPM_HASH = "3796f79b7859032eb989caf150351174cb84f9d88f83094f7f581edb9900da35ca2e89f5df101b399becffe4b988e854eaa7e501b23c989dd0b248efad417776"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-storages) \
python39-django-storages \
python3dist(django-storages)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
