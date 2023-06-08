SUMMARY = "Documentation for OpenStack os-service-types library"
DESCRIPTION = "The OpenStack Service Types Authority contains information about official \
OpenStack services and their historical service-type aliases. \
The data is in JSON and the latest data should always be used. This simple \
library exists to allow for easy consumption of the data, along with a built-in \
version of the data to use in case network access is for some reason not \
possible and local caching of the fetched data. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "os-service-types-doc-1.7.0-4.4.noarch.rpm"
RPM_HASH = "9388ce577e94115d54ecf45db78d9c38dce4002e5fc4e1c3fc520397700d5a7cf852fff406c40692022b12d15ab9bf13c44e4abb5737bd2435e6760c8ad92eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-service-types-doc"
RDEPENDS:${PN} += ""

inherit rpm
