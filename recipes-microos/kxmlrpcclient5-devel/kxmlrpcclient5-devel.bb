SUMMARY = "Library containing simple XML-RPC Client support: Build Environment"
DESCRIPTION = "Library containing simple XML-RPC Client support. Development files."
LICENSE = "BSD-2-Clause"

PV = "5.106.0"

RPM_NAME = "kxmlrpcclient5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "df0fd32bead9f313c2039fc5e3fe69a804fee2ff5d721447cfc804e6e4a9efec4923e5588c1009fed73f8a476f5f31c2130d7c1ee219e5325cf8d71d58e7e353"

RPROVIDES:${PN} += "cmake(KF5XmlRpcClient) kxmlrpcclient5-devel kxmlrpcclient5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5KIO) libKF5XmlRpcClient5"

inherit rpm
