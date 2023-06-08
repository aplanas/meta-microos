SUMMARY = "Development files for the OpenTracing C++ API"
DESCRIPTION = "Development files for opentracing-cpp - the C++ implementation of the \
OpenTracing API."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "opentracing-cpp-devel-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "88fd4c3c81f62bf6150bd95988b1660537a1df13bc556caef3ac9d2211aa7fe51bd0219c4765766c842a7a2b55a4f16124595f2353ab9a0aad64a0991a20fa5f"

RPROVIDES:${PN} += "opentracing-cpp-devel opentracing-cpp-devel(aarch-64)"
RDEPENDS:${PN} += "libopentracing-cpp1"

inherit rpm
