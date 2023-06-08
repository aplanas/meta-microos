SUMMARY = "Additional tuned profiles targeted to realtime"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to realtime."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-realtime-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "de9815c8ba4daf108117a967cb83b1740dbd1a7840aafe8e7e91b28045245a2aa80f059a01d3acec041212cebcb7a59f10a2d227269d67b956dadcb1d95bcff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(tuned-profiles-realtime) tuned-profiles-realtime"
RDEPENDS:${PN} += "/bin/bash tuned"

inherit rpm
