SUMMARY = "Development libraries for multipath-tools"
DESCRIPTION = "This package contains the development libraries for multipath-tools \
and libmpathpersist."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "0.9.4+86+suse.4d8901e"

RPM_NAME = "multipath-tools-devel-0.9.4+86+suse.4d8901e-1.1.aarch64.rpm"
RPM_HASH = "52a818f4ba71a5976c7fc7e13d652779918622eb9d9a5678c3e07ef0d234cc960e92c6e30ce77cd1a20a533b8ba620ed99f06d876a1589130fab7db9992321c7"

RPROVIDES:${PN} += "multipath-tools-devel multipath-tools-devel(aarch-64)"
RDEPENDS:${PN} += "libmpath0"

inherit rpm
