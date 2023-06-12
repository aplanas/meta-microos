SUMMARY = "Mercurial tests"
DESCRIPTION = "Mercurial is a fast, lightweight source control management system \
designed for efficient handling of very large distributed projects. \
 \
This package contains its tests."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.3"

RPM_NAME = "mercurial-tests-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "ba7f349a130663f1ab076679a8756fc45b0a10e89efa91e21a41bcd2a2db57a910a9378bb9edc3a100d8032b4b2f301ba1edbc8ce9f508c056220140660f2ba3"

RPROVIDES:${PN} += "mercurial-tests \
mercurial-tests(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
mercurial"

inherit rpm
