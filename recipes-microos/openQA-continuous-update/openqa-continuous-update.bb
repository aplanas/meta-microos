SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1683294886.8a7e554"

RPM_NAME = "openQA-continuous-update-4.6.1683294886.8a7e554-1.1.aarch64.rpm"
RPM_HASH = "43b3a32ac18399d8f8aadbe42c3a202031010fed3ad52b96255f699414cd9027840be16243aa3a675bbe5bec7a9e49e219bd1568e41caa90919c1cf431fac974"

RPROVIDES:${PN} += "openQA-continuous-update openQA-continuous-update(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh curl openQA-common"

inherit rpm
