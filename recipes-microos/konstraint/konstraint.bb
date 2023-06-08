SUMMARY = "A policy management tool for interacting with Gatekeeper"
DESCRIPTION = "Konstraint is a CLI tool to assist with the creation and management of templates and constraints when using Gatekeeper."
LICENSE = "Apache-2.0"

PV = "0.28.0"

RPM_NAME = "konstraint-0.28.0-1.1.aarch64.rpm"
RPM_HASH = "2b0d7218dad61acc307d1475357913ee8b549622f7674ee9ea89aa3987de34666869c0827b976d8ba4c5cefcdd940a7a8e79bc39f4b6db56363218759e2d5e20"

RPROVIDES:${PN} += "konstraint konstraint(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
