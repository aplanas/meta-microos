SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python311-croniter-1.3.15-1.1.noarch.rpm"
RPM_HASH = "1cfc0deafeadbb36d301d9f20693ab1e99959260af300b9fdd1dfa8015077d0c8933ce99775aeb2105e63344810d03b7756c24c61938fefaeb08a7216b6c343e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(croniter) \
python311-croniter \
python3dist(croniter)"
RDEPENDS:${PN} += "python(abi) \
python311-python-dateutil"

inherit rpm
