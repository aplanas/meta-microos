SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "python39-defcon-0.10.2-1.3.noarch.rpm"
RPM_HASH = "371764b4cb85dc25157558d49f2c01948bab9c81aceebd615a84d1ecf68585c6cb90f19060c70d90476f2df573bc480114084cf2e53fabf576275625692227ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(defcon) python39-defcon python3dist(defcon)"
RDEPENDS:${PN} += "python(abi) python39-FontTools python39-fs"

inherit rpm
