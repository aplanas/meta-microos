SUMMARY = "Moose in a box"
DESCRIPTION = "This Task installs Moose and then optionally installs a number of Moose \
extensions listed below. This list is meant to be comprehensive, so if I \
missed something please let me know."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Task-Moose-0.03-10.19.noarch.rpm"
RPM_HASH = "34a3ad172530c58c896171f2628001ee3060d1dfd4caccabcea275a4629e7310d46334d94e56c6303a53a3fab6d6c7362ec7d2c7268421a608b3a81349911c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Task::Moose) perl-Task-Moose"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Moose)"

inherit rpm
