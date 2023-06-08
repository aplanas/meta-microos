SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.2.32"

RPM_NAME = "python310-cron-descriptor-1.2.32-1.3.noarch.rpm"
RPM_HASH = "c345881cf5c55783d79216cb00b537a072b1c758e2b04f218fee165618d00cf59152a3625918eafc3c92c1ee9593012cbc049772048d6a340f5632d96396171c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cron-descriptor python3.10dist(cron-descriptor) python310-cron-descriptor python3dist(cron-descriptor)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
