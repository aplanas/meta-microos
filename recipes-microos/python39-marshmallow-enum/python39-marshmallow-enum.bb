SUMMARY = "Enum field for Marshmallow"
DESCRIPTION = "Enum field for Marshmallow."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-marshmallow-enum-1.5.1-1.10.noarch.rpm"
RPM_HASH = "ef78829f942e41a76e743e35031127792f914f2c4fbbe0a64c1499ff4d6cf6d6ee6d4d337b58c9f0ca98487a36a76c0c01ce58a0d133caeced0d623c2dc468b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(marshmallow-enum) python39-marshmallow-enum python3dist(marshmallow-enum)"
RDEPENDS:${PN} += "python(abi) python39-marshmallow"

inherit rpm
