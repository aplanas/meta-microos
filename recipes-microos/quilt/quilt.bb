SUMMARY = "A Tool for Working with Many Patches"
DESCRIPTION = "Quilt allows you to easily manage large numbers of patches by keeping \
track of the changes each patch makes. Patches can be applied, \
un-applied, refreshed, and more."
LICENSE = "GPL-2.0-or-later"

PV = "0.67"

RPM_NAME = "quilt-0.67-3.2.noarch.rpm"
RPM_HASH = "9176ac4ae3334a2561d8cb8793c3101360f63eb7ef42651717a6e18e5b5db4176b9b778fbdcf7830ba73b93856cd120c528435d1846eecdd00e86f62cf434764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(quilt) quilt"
RDEPENDS:${PN} += "/usr/bin/bash /usr/bin/perl coreutils diffstat diffutils file findutils gzip less mktemp patch perl"

inherit rpm
