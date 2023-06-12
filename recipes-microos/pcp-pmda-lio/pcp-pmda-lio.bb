SUMMARY = "Performance Co-Pilot (PCP) metrics for the LIO subsystem"
DESCRIPTION = "This package provides a PMDA to gather performance metrics from the kernels \
iSCSI target interface (LIO). The metrics are stored by LIO within the Linux \
kernels configfs filesystem. The PMDA provides per LUN level stats, and a \
summary instance per iSCSI target, which aggregates all LUN metrics within the \
target."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-lio-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "5722e6656ce55ec05d79a9a653a8e724e36e18f9f4f061c33dc602e4323d658f73a6e726a0bbd39aea89b26f56e46c157a490a24f5cc5a8a09de9b728cc35908"

RPROVIDES:${PN} += "pcp-pmda-lio \
pcp-pmda-lio(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp \
python3-rtslib-fb"

inherit rpm
