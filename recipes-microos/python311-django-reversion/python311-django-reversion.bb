SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python311-django-reversion-5.0.4-1.3.noarch.rpm"
RPM_HASH = "a3dba8eece8214c36e79836ee81de9920140eec7a2ab9c4e5f59fdae11137603ad8f71995f7f3ff159ef69b1af2b5a5516499b6db8327f104b6df6a9b9b82471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-reversion) python311-django-reversion python3dist(django-reversion)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
