SUMMARY = "Documentation for python-gevent"
DESCRIPTION = "Documentation and examples for python-gevent."
LICENSE = "MIT"

PV = "22.10.1"

RPM_NAME = "python-gevent-doc-22.10.1-3.1.noarch.rpm"
RPM_HASH = "670ca8aec58623facac106a3ee9f8506a0e5d10d38db06216bd5828b9801c63f3f234039957b4c25439a541c15914edc36916485656b87b416b284c072dd8fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gevent-doc python310-gevent-doc python311-gevent-doc python39-gevent-doc"
RDEPENDS:${PN} += ""

inherit rpm
