SUMMARY = "Documentation for python-gevent"
DESCRIPTION = "Documentation and examples for python-gevent."
LICENSE = "MIT"

PV = "22.10.2"

RPM_NAME = "python-gevent-doc-22.10.2-2.1.noarch.rpm"
RPM_HASH = "54498d4b7ae1a4151b4fbdd1304a2d82eb3a9e84085677e1b7b2a76766135fddb07bfc7b7322b58e9f22dfbbfa057b14cf9c728faf42ba87ddfc2600e6a4a8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-gevent-doc \
python310-gevent-doc \
python311-gevent-doc \
python39-gevent-doc"
RDEPENDS:${PN} += ""

inherit rpm
