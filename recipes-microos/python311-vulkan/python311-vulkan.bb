SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.1.99.1"

RPM_NAME = "python311-vulkan-1.1.99.1-1.15.noarch.rpm"
RPM_HASH = "10ea95bb978dfa353eb673a100364c3f26243f4312e4d73c1fb942e8f00a4994b4ff84601a5bc953a8778b0814c9886eebfaacff9fb7b649187adfbb53a5b947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vulkan) python311-vulkan python3dist(vulkan)"
RDEPENDS:${PN} += "python(abi) python311-cffi vulkan"

inherit rpm
