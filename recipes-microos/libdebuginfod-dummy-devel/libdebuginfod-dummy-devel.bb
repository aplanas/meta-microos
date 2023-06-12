SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-dummy-devel-0.189-3.1.aarch64.rpm"
RPM_HASH = "879eaf1de3e3a33d28feacf63cbca7634ee1d8091e70a11c39b19cd88238ba746e6aa10bf866df22f068a563a67e8434e22051a062e37f4bac572ccbeab3b37b"

RPROVIDES:${PN} += "libdebuginfod-devel libdebuginfod-dummy-devel libdebuginfod-dummy-devel(aarch-64)"
RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm
