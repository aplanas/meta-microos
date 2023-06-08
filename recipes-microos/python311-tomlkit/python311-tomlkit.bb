SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.7"

RPM_NAME = "python311-tomlkit-0.11.7-2.1.noarch.rpm"
RPM_HASH = "07df80dcf442cf25188e747599025072b745ec408d9a0ebef7ddb1b0ffda2c4253107d2fda850467100addb35002c4239169aab818b1a98e81f59d6c3b9de572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tomlkit) python311-tomlkit python3dist(tomlkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
