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

RPM_NAME = "python310-venusian-3.0.0-2.14.noarch.rpm"
RPM_HASH = "bfdb7a148f098f25516fd19ee7afa778f2dadc97b32b3b3d15643228fa53993b42c611242c8889f638528238744dbbd3cd79810a154ceba01faeac1be54ea45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-venusian python3.10dist(venusian) python310-venusian python3dist(venusian)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
