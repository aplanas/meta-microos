SUMMARY = "Vanilla HTML components for Dash - Legacy"
DESCRIPTION = "Vanilla HTML components for Dash \
 \
As of Dash 2, the development of dash-html-components has been moved to the main Dash repo \
 \
This package exists for backward compatibility as Dash still lists it as requirement. It \
has no further functionality than displaying a deprecation message."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-dash-html-components-2.0.0-1.5.noarch.rpm"
RPM_HASH = "f54852bbaafca5f73afd67000ea696f26494c49fb01636da991d68cb5af17e8830d4608bfd664ffacbae476ad702415ab61a89e9c5177f514c1d1668f2404099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dash-html-components) python39-dash-html-components python3dist(dash-html-components)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
