SUMMARY = "GNUstep Makefile package"
DESCRIPTION = "This package contains the basic scripts, makefiles and directory \
layout needed to run and compile any GNUstep software. This package \
was configured for the FHS file system layout, customised for SUSE."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "2.9.1"

RPM_NAME = "gnustep-make-2.9.1-1.2.aarch64.rpm"
RPM_HASH = "6d08137f1ba58aaae9a288f65ec9937cd8734d2af85119246e926c7764f34008975a29581077be3ce85a4b96a657df205619ab2b93ab3d4d24dedba948d5762c"

RPROVIDES:${PN} += "config(gnustep-make) gnustep-make gnustep-make(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /sbin/ldconfig /usr/bin/bash"

inherit rpm
