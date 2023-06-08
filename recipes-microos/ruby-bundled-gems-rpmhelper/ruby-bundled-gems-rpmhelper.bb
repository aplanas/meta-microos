SUMMARY = "A little helper to add provides for intree gems during a ruby build"
DESCRIPTION = "Just a little helper to add provides for intree gems during a ruby build"
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "ruby-bundled-gems-rpmhelper-0.0.2-1.10.noarch.rpm"
RPM_HASH = "3c4483e5e8d4d516140273774d5eb64ac1505948976e4a0608bf13b454e67b2efd30b6cd021030b46c60bfeffe275787e99c42de669598d5a8d8dc67ac4ec290"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-bundled-gems-rpmhelper"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
