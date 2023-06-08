SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.14"

RPM_NAME = "python311-croniter-1.3.14-1.1.noarch.rpm"
RPM_HASH = "88405b3c6f666acdd54042a7ad76bd9424f3965fa0660646a69432607101b9b780169ced548fe268433d12e87e43a6a59c3c3b7456a2b3780aefd27d0601133b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(croniter) python311-croniter python3dist(croniter)"
RDEPENDS:${PN} += "python(abi) python311-python-dateutil"

inherit rpm
