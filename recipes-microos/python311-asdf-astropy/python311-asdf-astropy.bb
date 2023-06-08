SUMMARY = "ASDF serialization support for astropy"
DESCRIPTION = "ASDF serialization support for astropy"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "python311-asdf-astropy-0.3.0-1.3.noarch.rpm"
RPM_HASH = "548d2eb9017f247372bca42164fb991df28f3fe67a4477d2c623fcee02927ee35fdcfbfd4c33560ad1a73ac4c45de05368044f502fa1a2e876e736ccf6a9e056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(asdf-astropy) python311-asdf-astropy python3dist(asdf-astropy)"
RDEPENDS:${PN} += "python(abi) python311-asdf python311-asdf-coordinates-schemas python311-asdf-transform-schemas python311-astropy python311-numpy python311-packaging"

inherit rpm
