SUMMARY = "Java getopt Implementation"
DESCRIPTION = "The GNU Java getopt classes support short and long argument parsing in \
a manner 100% compatible with the version of GNU getopt in glibc 2.0.6 \
with a mostly compatible programmer's interface as well. Note that this \
is a port, not a new implementation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.14"

RPM_NAME = "gnu-getopt-1.0.14-1.13.noarch.rpm"
RPM_HASH = "fb3470c3b9d1345fd99d065ab87693530ebf0f1d040f5e3aeade135e8afc7795f465f4d342f9ac97faf5f73bbe9e05f485b4c344a4aa692e86a5f860a7a92544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-getopt"
RDEPENDS:${PN} += ""

inherit rpm
