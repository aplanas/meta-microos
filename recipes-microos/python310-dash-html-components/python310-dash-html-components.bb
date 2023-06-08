SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-dash-html-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "5f616705a27bf67fc5ff0b4e0101de0b6258db521bde0f7b0c295195a92f6a63615c0c672ae30cea771656ef9415248c1017e8e66d0f9eac8ad38a98b5ffe4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-html-components python3.10dist(dash-html-components) python310-dash-html-components python3dist(dash-html-components)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
