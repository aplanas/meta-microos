SUMMARY = "Libraries and headers to build debuginfod client applications"
DESCRIPTION = "The libdebuginfod-devel package contains the libraries \
to create applications to use the debuginfod service. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod-dummy-devel-0.189-2.3.aarch64.rpm"
RPM_HASH = "e4739f7f89d756085ce2b5eac234cc30a378d814570b0e6ea214a46eeb5856129520203b804de7f220fa94138845918b382332626464e603ddb4660c9733eed4"

RPROVIDES:${PN} += "libdebuginfod-devel libdebuginfod-dummy-devel libdebuginfod-dummy-devel(aarch-64)"
RDEPENDS:${PN} += "libdebuginfod1-dummy"

inherit rpm
