SUMMARY = "Library containing simple XML-RPC Client support: Build Environment"
DESCRIPTION = "Library containing simple XML-RPC Client support. Development files."
LICENSE = "BSD-2-Clause"

PV = "5.105.0"

RPM_NAME = "kxmlrpcclient5-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "bd1fdea22c0fe120a95fdaba53027c52e6885cc5a6ca53f25d74bc53c9d67416f1360d8743c689db6283a885a0c8b86a84aa8825ca438e5e4e66b146a14d87d6"

RPROVIDES:${PN} += "cmake(KF5XmlRpcClient) kxmlrpcclient5-devel kxmlrpcclient5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5KIO) libKF5XmlRpcClient5"

inherit rpm
