SUMMARY = "A library for deferring decorator actions"
DESCRIPTION = "Venusian is a library which allows framework authors to defer \
decorator actions.  Instead of taking actions when a function (or \
class) decorator is executed at import time, you can defer the action \
usually taken by the decorator until a separate 'scan' phase. \
 \
See the 'docs' directory of the package or the online documentation at \
http://docs.pylonsproject.org/projects/venusian/dev/."
LICENSE = "SUSE-Repoze & ZPL-2.1"

PV = "3.0.0"

RPM_NAME = "python311-venusian-3.0.0-2.14.noarch.rpm"
RPM_HASH = "df7a07514a6a90b76b7db11156385e534ab7c8bdc745117b174ab6672dd9c400248f5dac03652d22a3026c2d22543745090a2585d8b39ec56c81b33613946830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(venusian) python311-venusian python3dist(venusian)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
