SUMMARY = "DRBD distributed resource management utility"
DESCRIPTION = "This client program communicates to a linstor controller node which manages the DRBD9 resources."
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "python311-linstor-client-1.12.0-1.10.aarch64.rpm"
RPM_HASH = "7bd821a47682a4dd7fb370671ed4f37078613f190790279cbfa09e255161e664112bef98022598d0dad0103915fd1cde1ae55fa204a61d357630fd3307bd3a9a"

RPROVIDES:${PN} += "python3.11dist(linstor-client) \
python311-linstor-client \
python311-linstor-client(aarch-64) \
python3dist(linstor-client)"
RDEPENDS:${PN} += "python(abi) \
python311-linstor"

inherit rpm
