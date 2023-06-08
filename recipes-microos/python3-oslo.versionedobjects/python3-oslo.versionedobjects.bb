SUMMARY = "Oslo Versioned Objects library"
DESCRIPTION = "oslo.versionedobjects library deals with DB schema being at different versions \
than the code expects, allowing services to be operated safely during upgrades. \
It enables DB independent schema by providing an abstraction layer, which \
allows us to support SQL and NoSQL Databases. oslo.versionedobjects is also \
used in RPC APIs, to ensure upgrades happen without spreading version dependent \
code across different services and projects. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-oslo.versionedobjects-3.1.0-1.2.noarch.rpm"
RPM_HASH = "4a7f51439141df9835165f6b9bdabd1b0ed52f52114d766e97fe53ab7be569feeec22bdd547e8f2e5b15548544a24e21628a16df2025aaa6f62496b51661c5b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.versionedobjects python3.10dist(oslo.versionedobjects) python3dist(oslo.versionedobjects)"
RDEPENDS:${PN} += "python(abi) python3-WebOb python3-iso8601 python3-netaddr python3-oslo.concurrency python3-oslo.config python3-oslo.context python3-oslo.i18n python3-oslo.log python3-oslo.messaging python3-oslo.serialization python3-oslo.utils"

inherit rpm
