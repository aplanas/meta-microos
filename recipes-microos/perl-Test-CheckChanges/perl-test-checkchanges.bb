SUMMARY = "Check that the Changes file matches the distribution."
DESCRIPTION = "This module checks that you _Changes_ file has an entry for the current \
version of the *Module* being tested. \
 \
The version information for the distribution being tested is taken out of \
the Build data, or if that is not found, out of the Makefile. \
 \
It then attempts to open, in order, a file with the name _Changes_ or \
_CHANGES_. \
 \
The _Changes_ file is then parsed for version numbers. If one and only one \
of the version numbers matches the test passes. Otherwise the test fails. \
 \
A message with the current version is printed if the test passes, otherwise \
dialog messages are printed to help explain the failure. \
 \
The _examples_ directory contains examples of the different formats of \
_Changes_ files that are recognized."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.14"

RPM_NAME = "perl-Test-CheckChanges-0.14-16.22.noarch.rpm"
RPM_HASH = "c8ea24f8e0cdee252754710a1d4a9e9ff23829f12419efa1004cecbbad20235a88d501e005727e656102bfb536af0b8d0b62055a93199af6027fe43ad51986c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::CheckChanges) \
perl-Test-CheckChanges"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
