SUMMARY = "Abstraction over multiple cloud provider APIs"
DESCRIPTION = "Apache Libcloud is a standard Python library that abstracts away \
differences among multiple cloud provider APIs."
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "python311-apache-libcloud-3.7.0-1.5.noarch.rpm"
RPM_HASH = "8af0762ae4ca6974596eb703dd8e96ceb1a5e9417e96658270a2e45171cf36538df9540c42e5e705bac2f14debcb1a7f080e6431885f9dc1faa3c7eaa1e8d718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apache-libcloud) python311-apache-libcloud python3dist(apache-libcloud)"
RDEPENDS:${PN} += "python(abi) python311-lxml python311-requests python311-typing"

inherit rpm
