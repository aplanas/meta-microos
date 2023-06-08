SUMMARY = "Development files for occt"
DESCRIPTION = "Developer documentation for OpenCASCADE"
LICENSE = "LGPL-2.1-only-WITH-OCCT-exception-1.0"

PV = "7.7.0"

RPM_NAME = "occt-devel-doc-7.7.0-1.3.noarch.rpm"
RPM_HASH = "7d47be1098fc69925257a8dc2f42f784ddfa76f758f998c0e158ea7437e9498d36e927f821e776a34bdbc2094321c95609e97ecccbc0a8ef8dca507a1db9b85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "occt-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
