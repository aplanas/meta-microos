SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.7"

RPM_NAME = "python39-tomlkit-0.11.7-2.1.noarch.rpm"
RPM_HASH = "deab42ea190e784983ecbb5a46ad7e26926fbbb834ab85feda9966c362cf63208719a4852ed360b93083e8e2710e4d9de4c95ec5172bd67e7760e5bf68a337f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tomlkit) python39-tomlkit python3dist(tomlkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
