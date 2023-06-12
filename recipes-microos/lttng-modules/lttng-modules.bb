SUMMARY = "Licensing information for package lttng-modules"
DESCRIPTION = "This package provides licensing documentation for the lttng kmp packages."
LICENSE = "GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "2.13.9"

RPM_NAME = "lttng-modules-2.13.9-1.2.aarch64.rpm"
RPM_HASH = "54ea4e1859deab5dc696bb96fd1bd703bd024a3f600e565fde391e32722897f8276d6f3febd4dce86ffef4fb04811c34c269b68fc6723931083c126b74a6ef7e"

RPROVIDES:${PN} += "lttng-modules lttng-modules(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
