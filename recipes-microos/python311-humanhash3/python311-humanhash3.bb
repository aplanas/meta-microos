SUMMARY = "Human-readable representations of digests"
DESCRIPTION = "humanhash provides human-readable representations of digests."
LICENSE = "Unlicense"

PV = "0.0.6"

RPM_NAME = "python311-humanhash3-0.0.6-2.17.noarch.rpm"
RPM_HASH = "18ac2622455cfc68d795c1715acf7368ce731ee442e46512082039f32db938617f441591df6891a593606f995f3e9290ff78c1cd342977026b83e97410661aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(humanhash3) python311-humanhash3 python3dist(humanhash3)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
