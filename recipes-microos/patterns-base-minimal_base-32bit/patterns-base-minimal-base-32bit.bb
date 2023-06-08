SUMMARY = "Minimal Appliance Base"
DESCRIPTION = "The 32bit pattern complementing minimal_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-minimal_base-32bit-20200505-40.1.aarch64.rpm"
RPM_HASH = "0340eda993e72a5ed07bce28a6d08d74959cfd30e6d2e90092de608e9144030b6f2bc54b25a56c211e1a05c37a361f9c5c3fc7a2f613f0ba9aabbee9db27076c"

RPROVIDES:${PN} += "pattern() patterns-base-minimal_base-32bit patterns-base-minimal_base-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
