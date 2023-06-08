SUMMARY = "Parallel Printer Support"
DESCRIPTION = "This package creates static udev nodes for the parallel ports.  The \
purpose is to load the 'lp' kernel module automatically the first time \
data is sent to the parallel port. \
 \
Since the lp kernel module can't autodetect devices, this is the only \
way to load the parallel printer modules without manual intervention."
LICENSE = "BSD-2-Clause"

PV = "1.00"

RPM_NAME = "parallel-printer-support-1.00-14.14.noarch.rpm"
RPM_HASH = "d18449b1d999d33529eaec8db1412d9185d693245ccd1a1fd6f3969efdb069a47e19c228ca7013ea925869320b09a48cf806fb64265b47cc38c9f86175d39955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "parallel-printer-support"
RDEPENDS:${PN} += "/bin/sh aaa_base group(lp) systemd udev"

inherit rpm
