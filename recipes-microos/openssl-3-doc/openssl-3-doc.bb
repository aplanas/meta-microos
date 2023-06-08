SUMMARY = "Additional Package Documentation"
DESCRIPTION = "This package contains optional documentation provided in addition to \
this package's base documentation."
LICENSE = "Apache-2.0"

PV = "3.0.8"

RPM_NAME = "openssl-3-doc-3.0.8-2.3.noarch.rpm"
RPM_HASH = "5a917f43e1d48712f7bf528e114d61d9d3ae5b237d7ddd0a7f46ea23f8497feda792459084f7357f6e2550bf04625f4b99ebe56b3fdbc1741e53f10ebd1af861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openssl-3-doc openssl-doc"
RDEPENDS:${PN} += ""

inherit rpm
