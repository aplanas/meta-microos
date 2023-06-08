SUMMARY = "Documentation for qt6-grpc in HTML format"
DESCRIPTION = "This package contains documentation for qt6-grpc in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-grpc-docs-html-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "a284aa42a70a8033adf65167ac4a440c8581dc63e95c0d082ee055e9458f40ce5d9d7cbd2e7c126cdc80e00d79cb144b5e90a4eadfb3c4dccf814a41d9c358e2"

RPROVIDES:${PN} += "qt6-grpc-docs-html qt6-grpc-docs-html(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
