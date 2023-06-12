SUMMARY = "Container Library and tools for working with container registries"
DESCRIPTION = "This is a golang library for working with container registries."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "go-containerregistry-0.12.1-1.3.aarch64.rpm"
RPM_HASH = "871eea4ec569ce480e4a56235b69b7c91b9e7af50f70558b5ff90c04ff5be5aeda2082f2fb2b01bdde2b7fd060fda4d3f2b00ca12e8adcd560c650d9031d1ae3"

RPROVIDES:${PN} += "go-containerregistry \
go-containerregistry(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
