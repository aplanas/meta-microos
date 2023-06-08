SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python39-derpconf-0.8.3-1.16.noarch.rpm"
RPM_HASH = "3b29f8bcbf6e8eb9b2f47308b4c8b80b787bbd4e379b6d53f3f312bf2ce554976f56d9c517d6fdb6ddcd7dc0e9a86664bd452a097d5725450e30122f0a98cb16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(derpconf) python39-derpconf python3dist(derpconf)"
RDEPENDS:${PN} += "python(abi) python39-six"

inherit rpm
