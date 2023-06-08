SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python311-derpconf-0.8.3-1.16.noarch.rpm"
RPM_HASH = "ff350537d249566275cb0a2c8d064e31535b169c506c0fc4295c86c540a7ad0a339c7464fc652e22723a111794515486d9ab46f4689343679b1994b6d40df8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(derpconf) python311-derpconf python3dist(derpconf)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
