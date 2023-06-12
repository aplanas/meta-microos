SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python39-django-taggit-4.0.0-1.1.noarch.rpm"
RPM_HASH = "998f7008bf2d957f0a1ac42e5cfa8d9df465663f431349d17271999e947dcab8ef230d6b09de2f8c0b9ee825b6b8a710f6995df5efe3be2fc5da92a146272a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-taggit) \
python39-django-taggit \
python3dist(django-taggit)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
