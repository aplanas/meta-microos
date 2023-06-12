SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python311-tomlkit-0.11.8-1.1.noarch.rpm"
RPM_HASH = "b396def631fb18c6eada7069b4356324f1f0a846a9cda30ef8aa007052661d3affe502da8e69e8e078d3d79d2c8f129c1aef9c1030a23c4f39c43dd18c80b702"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tomlkit) \
python311-tomlkit \
python3dist(tomlkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
