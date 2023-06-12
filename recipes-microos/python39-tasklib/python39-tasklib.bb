SUMMARY = "Python Task Warrior library"
DESCRIPTION = "Tasklib is a Python library for interacting with taskwarrior \
databases, using a queryset API similar to that of Django's ORM."
LICENSE = "BSD-3-Clause"

PV = "2.5.1"

RPM_NAME = "python39-tasklib-2.5.1-1.3.noarch.rpm"
RPM_HASH = "1f3afd3847f7284d959e501a2618882c50266efee57fc852e7de3fd33e5f49c393ce53c0569717f990a6e33d4b8ce64efa60838797b7ee9b0d6203d6524d44f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tasklib) \
python39-tasklib \
python3dist(tasklib)"
RDEPENDS:${PN} += "python(abi) \
python39-pytz \
python39-tzlocal \
taskwarrior"

inherit rpm
