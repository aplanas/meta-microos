SUMMARY = "Improvements over the standard pathlib module and pathlib2 package"
DESCRIPTION = "Improvements over the standard pathlib module and pathlib2 package."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-ruamel.std.pathlib-0.9.2-2.3.noarch.rpm"
RPM_HASH = "ce7e614c8b341b0a596d8ecc3ed1bc100fda8abd60b167e2cb11d86a682a8c90260a4e8343f10905267d5e664950e40b0dcd447aa9f3175d2fe0fd4e4e169a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ruamel.std.pathlib) python39-ruamel.std.pathlib python3dist(ruamel.std.pathlib)"
RDEPENDS:${PN} += "python(abi) python39-ruamel.base"

inherit rpm
