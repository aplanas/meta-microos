SUMMARY = "Python3 bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Python 3 bindings for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "python3-libproxy-0.4.18-1.6.noarch.rpm"
RPM_HASH = "32bb5e36ee2ccf18a76eb21ed95d2a90fd405132bde4308fd9f47555d4aa7daaed3e784a568b463a8f9359e72a70dff959c837ef88e0ab9d124fd2bc676f5606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libproxy"
RDEPENDS:${PN} += "libproxy1 python(abi)"

inherit rpm
