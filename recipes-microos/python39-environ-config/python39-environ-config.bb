SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python39-environ-config-22.1.0-1.3.noarch.rpm"
RPM_HASH = "a68f8fa565ef6b7b1c06cd461f36865e611ed30d721d292ff80440cee12c3c2a9b7f34e25659697668838d2effd21eac5911090c50d2e3de89dd4b9770dec001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(environ-config) python39-environ-config python3dist(environ-config)"
RDEPENDS:${PN} += "python(abi) python39-attrs"

inherit rpm
