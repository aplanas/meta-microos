SUMMARY = "Additional tuned profile(s) targeted to PostgreSQL server loads"
DESCRIPTION = "Additional tuned profile(s) targeted to PostgreSQL server loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.20.0.18+git.7b1a20b"

RPM_NAME = "tuned-profiles-postgresql-2.20.0.18+git.7b1a20b-1.1.noarch.rpm"
RPM_HASH = "e57dd193b51dc4623551b582b13e6a42df33d8c43d03681a6d90ee996f8e441d615990bac20550865c0eae945c2941c9c874a55790c7bdcb1821a51b8225fa8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-postgresql"
RDEPENDS:${PN} += "tuned"

inherit rpm
