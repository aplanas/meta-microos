SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-XStatic-1.0.2-2.14.noarch.rpm"
RPM_HASH = "452dd57c740bc11559e20b0f51e2d5e70f0ff4a129d09ed76eb8a29e10b0c9632c41196d8c736feecb3d5afc81ca56e8dfc1c00c73670ce5cd7fe6df8499deab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xstatic) python311-XStatic python3dist(xstatic)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
