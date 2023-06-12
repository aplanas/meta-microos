SUMMARY = "Developer documentation for openCOLLADA"
DESCRIPTION = "This package provides documentation for openCOLLADA."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libopenCOLLADA-doc-1.6.68-1.12.noarch.rpm"
RPM_HASH = "ccf90dd7843ef2b5b03f98de0bf6efa686e9cf98de6b4f9592a093aaeb30ffd048abbebc3e0b1e61df29e5f57a3a47e90e80e99c44807109eb1928650f32c14e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenCOLLADA-doc \
openCOLLADA-doc"
RDEPENDS:${PN} += ""

inherit rpm
