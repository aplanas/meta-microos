SUMMARY = "Jinja2 pluralize filters"
DESCRIPTION = "Jinja2 pluralize filters."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-jinja2-pluralize-0.3.0-2.8.noarch.rpm"
RPM_HASH = "e562d27dd2001e3858b50a8fe760cc5c4251900564e654a8df64ac45b473a8c026e9a3caf3bdec2d9d9952b08ecd45014a32765a349adf60b8d58e3194ca870b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jinja2-pluralize) python311-jinja2-pluralize python3dist(jinja2-pluralize)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-inflect"

inherit rpm
