SUMMARY = "Skeleton for openSUSE OSS Media Sets"
DESCRIPTION = "Internal package only, used for openSUSE OSS Media sets"
LICENSE = "MIT"

PV = "84.87.20230502.ce4b10d"

RPM_NAME = "skelcd-openSUSE-84.87.20230502.ce4b10d-1.1.aarch64.rpm"
RPM_HASH = "b3aeaa68d46e6325d2cb751076e6a6e53274f98ab842fef7960b39eae5b1489f8d238a63a5852e158dffb16c003331f93bdd5a5c03bf88924d256306834a7079"

RPROVIDES:${PN} += "skelcd-openSUSE \
skelcd-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
