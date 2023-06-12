SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python310-tomlkit-0.11.8-1.1.noarch.rpm"
RPM_HASH = "2175758428717a3ef7d5b2e04ae0a8530ba0e4e0c362741fbc83f8539ab5df0c7aa4a9a312e5e864037d9147ba65570546288bad0f20fe738bb4bad3a32a82b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomlkit python3.10dist(tomlkit) python310-tomlkit python3dist(tomlkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
