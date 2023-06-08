SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python311-cachelib-0.10.2-1.3.noarch.rpm"
RPM_HASH = "71cb0c431cb49b2b91a89a85e37e9db687f192f0c38d97c4f8f7efb29ad790ce907edec24417941abea0b0d35b30bb9ae69b284a73b31e2311f809aee10b28c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cachelib) python311-cachelib python3dist(cachelib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
