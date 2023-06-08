SUMMARY = "Build environment for libkexiv2, a library to manipulate picture meta data"
DESCRIPTION = "Libkexiv2 is a wrapper around Exiv2 library to manipulate pictures \
metadata."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkexiv2-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d66cf6388ec44888a1747091c255c8f9747ebfcf9fd674dca2c307d4e7a061b9803191145b526bc00cea4e8a698fb1e6eaeb30a76b738e17ca6a3fcc2beb9969"

RPROVIDES:${PN} += "cmake(KF5KExiv2) libkexiv2-devel libkexiv2-devel(aarch-64) libkexiv2-kf5-devel"
RDEPENDS:${PN} += "libKF5KExiv2-15_0_0"

inherit rpm
