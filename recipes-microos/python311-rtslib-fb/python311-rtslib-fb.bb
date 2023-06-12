SUMMARY = "API for Linux kernel SCSI target (aka LIO)"
DESCRIPTION = "rtslib-fb is an object-based Python library for configuring the LIO generic \
SCSI target, present in 3.x Linux kernel versions. rtslib-fb is licensed under \
the Apache 2.0 license. Contributions are welcome"
LICENSE = "Apache-2.0"

PV = "2.1.75"

RPM_NAME = "python311-rtslib-fb-2.1.75-3.1.noarch.rpm"
RPM_HASH = "67d617bcd0749ed586633f914b997f64d7558cee9f47f2b38752cb2df78dfa4492872f08f8251ad51fa902c41ea843fe16270f7057eb4596860cead61c9aba6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(rtslib-fb) \
python311-rtslib \
python311-rtslib-fb \
python3dist(rtslib-fb)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python-rtslib-fb-common \
python311-pyudev"

inherit rpm
