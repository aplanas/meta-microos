SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python310-django-reversion-5.0.4-1.3.noarch.rpm"
RPM_HASH = "26fbd8546899a6615a0f7f4d796efdc9cbf136d561490e0caaf1cb8965a12e592f87c40a7866bcd2cb715315d9c1fda809055364c35837f7cee4555b40609e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-reversion \
python3.10dist(django-reversion) \
python310-django-reversion \
python3dist(django-reversion)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
