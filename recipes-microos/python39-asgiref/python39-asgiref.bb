SUMMARY = "ASGI specs, helper code, and adapters"
DESCRIPTION = "ASGI is a standard for Python asynchronous web apps and servers to communicate \
with each other, and positioned as an asynchronous successor to WSGI. You can \
read more at https://asgi.readthedocs.io/en/latest/"
LICENSE = "BSD-3-Clause"

PV = "3.6.0"

RPM_NAME = "python39-asgiref-3.6.0-2.1.noarch.rpm"
RPM_HASH = "1fde847376476ee277633bf0d335121b094c279d0f55bfe624e093c07def1796a44cf725732b20458776c885b22fbd7df767a15b81af62e3ccece7bf81691aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asgiref) \
python39-asgiref \
python3dist(asgiref)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
