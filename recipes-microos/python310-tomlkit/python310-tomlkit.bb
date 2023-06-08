SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.7"

RPM_NAME = "python310-tomlkit-0.11.7-2.1.noarch.rpm"
RPM_HASH = "69b5f4ecf5705443a2eecd3903f4844c4b59e5b9f515cb115a8dbb3ed7705b10a89243bd18e7092ff677f3d4194146716e7571d371ff70ec62f8b4c4e3fdb590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomlkit python3.10dist(tomlkit) python310-tomlkit python3dist(tomlkit)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
