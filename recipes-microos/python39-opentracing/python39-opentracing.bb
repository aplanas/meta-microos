SUMMARY = "OpenTracing API for Python"
DESCRIPTION = "OpenTracing API for Python. \
See documentation at http://opentracing.io"
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python39-opentracing-2.4.0-4.2.noarch.rpm"
RPM_HASH = "db9da3b7e292034d6520fab48d3f6c1d701370a09abcc12112780a1821251380ff624d0b1e935a309ab1a855512cc6461aa8ab359ebaba483a2fe092a3f0c0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opentracing) python39-opentracing python3dist(opentracing)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
