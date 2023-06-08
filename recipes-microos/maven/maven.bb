SUMMARY = "Java project management and project comprehension tool"
DESCRIPTION = "Maven is a software project management and comprehension tool. Based on the \
concept of a project object model (POM), Maven can manage a project's build, \
reporting and documentation from a central piece of information."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.1"

RPM_NAME = "maven-3.9.1-1.1.aarch64.rpm"
RPM_HASH = "0f1214ffc69a600235365a21be750804f738dfe3af36bc55c1436bc347db1cf93d98dcf93fc5b186d6af48d7a26946ab506b362ee2adf38fa617d1502e4023c6"

RPROVIDES:${PN} += "maven maven(aarch-64)"
RDEPENDS:${PN} += "aaa_base maven-lib"

inherit rpm
