SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python310-opentracing-2.4.0-4.2.noarch.rpm"
RPM_HASH = "7ede5590ba48e0ff22f3b174d28571eee4088b04fc38e1de5a882f3ad8d7ec289e5cadfd046996f231dba8a77a5e6d4c19cded13eda5dcb564b60286a2120576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentracing python3.10dist(opentracing) python310-opentracing python3dist(opentracing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
