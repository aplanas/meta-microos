SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python310-rtslib-fb-2.1.75-3.1.noarch.rpm"
RPM_HASH = "b7c49f1e6f907e84400096f029ca0e06fdd00845b207ed5057c93ab6386587daa56cdd9f8534d66f6c9434476aa7d63216d9562c74e79976f751f6df9402d48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rtslib python3-rtslib-fb python3.10dist(rtslib-fb) python310-rtslib python310-rtslib-fb python3dist(rtslib-fb)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python-rtslib-fb-common python310-pyudev"

inherit rpm
