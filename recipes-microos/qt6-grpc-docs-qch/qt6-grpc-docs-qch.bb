SUMMARY = "Documentation for qt6-grpc in QCH format"
DESCRIPTION = "This package contains documentation for qt6-grpc in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-grpc-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2ef8912e75234555932cd1e17c8900dcb3e7e5e70377772dec2b0840e45b95c0c4110150a3895ef59a5a9c76af8e4e468e84bba7473507ce36c7d7c26c0aaa23"

RPROVIDES:${PN} += "qt6-grpc-docs-qch qt6-grpc-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
