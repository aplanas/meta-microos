SUMMARY = "Portable Scheme Library"
DESCRIPTION = "SLIB is a portable Scheme library providing compatibility and utility \
functions for all standard Scheme implementations."
LICENSE = "SUSE-SLIB"

PV = "3b7"

RPM_NAME = "slib-3b7-1.2.noarch.rpm"
RPM_HASH = "cd9f0245862d53b8f006fa0ccbd5c1a3fe6307447f882250a0ccf3220ba740e3b19c18c591393a250a49184d6adaef4a5d17ffee74340b09aa3226ae0f4b54fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slib"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
guile1"

inherit rpm
