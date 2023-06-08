SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C++ libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "libradospp-devel-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "0374811b8febff0256a47ace9233d17dd4baeec0f4f2044052c9e70faf69a519268ec584bec1001f5ff8ba89629e3365aab76b8f5286cbb814b9d17a88df3d76"

RPROVIDES:${PN} += "libradospp-devel libradospp-devel(aarch-64)"
RDEPENDS:${PN} += "librados-devel librados2"

inherit rpm
