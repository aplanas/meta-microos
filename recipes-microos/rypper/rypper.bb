SUMMARY = "Wrapper around zypper for managing multiple repositories"
DESCRIPTION = "rypper is a wrapper around zypper for performing repository operations \
in batch.  It allows selection of which repositories to operate on via \
a number of different repository selection specifiers."
LICENSE = "GPL-3.0+"

PV = "0.24"

RPM_NAME = "rypper-0.24-1.17.noarch.rpm"
RPM_HASH = "ab759326cb9761f7d003c5f0a868097e76f2a601e886523c151cd7c859a2f9626319a24a9810848a8e7940b82268f43d039aa198fbfedc81cc2b55bbdd03608e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rypper"
RDEPENDS:${PN} += "/usr/bin/perl perl zypper"

inherit rpm
