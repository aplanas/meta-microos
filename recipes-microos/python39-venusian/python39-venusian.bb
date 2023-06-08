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

RPM_NAME = "python39-venusian-3.0.0-2.14.noarch.rpm"
RPM_HASH = "f96da71da7bb937643139269bbef4b79a36b01d4dbef2ec4d21549a832cc82b3176b5b32851e9eeb04a51e5ddb089eaf2ffa8e14dedcbf5bef5c3bff9e5909a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(venusian) python39-venusian python3dist(venusian)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
