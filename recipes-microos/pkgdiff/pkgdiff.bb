SUMMARY = "Package Changes Analyzer"
DESCRIPTION = "A tool for visualizing changes in Linux software packages (RPM, DEB, TAR.GZ, etc). \
The tool is intended for Linux maintainers who are interested in ensuring \
compatibility of old and new versions of packages."
LICENSE = "GPL-2.0-only"

PV = "1.7.2"

RPM_NAME = "pkgdiff-1.7.2-2.8.noarch.rpm"
RPM_HASH = "4fe34fa6f5680aee0cc9d700a3b8e15b43ccbca1610de79b2c5220d59d76814546a1f9c770b2e7b8274b49ceba1d5e906638a022d65a2857c617f460e0190733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgdiff"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl awk binutils diff perl-base wdiff"

inherit rpm
