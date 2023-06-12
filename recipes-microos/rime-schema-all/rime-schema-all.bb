SUMMARY = "All rime input schemas"
DESCRIPTION = "All rime input schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-all-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "bb42bc3753bbd84d4ae053577f3ea309efcd234abeffabb34786df065049665963fc1c0b086bb7d2385a4f8264767e2655a742b44dedcf643fd9d7bc444f8dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brise rime-schema-all"
RDEPENDS:${PN} += "rime-schema-default rime-schema-extra"

inherit rpm
