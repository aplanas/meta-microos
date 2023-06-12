SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python311-tasklib-2.5.1-1.3.noarch.rpm"
RPM_HASH = "461e3a50866c6839ff3da4c7fe4ab142bb436291189e5eb1f112c1f28bf06830fab712724a65cb5c225931a75b80ebf5a0c9ff78e68d69a3a7d7ad5b721eca18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tasklib) \
python311-tasklib \
python3dist(tasklib)"
RDEPENDS:${PN} += "python(abi) \
python311-pytz \
python311-tzlocal \
taskwarrior"

inherit rpm
