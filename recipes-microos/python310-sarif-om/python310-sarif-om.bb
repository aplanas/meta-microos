SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python310-sarif-om-1.0.4-1.4.noarch.rpm"
RPM_HASH = "9e1577aee11edd84d6bd169f53f367f64d6797be87613c8c717600f745713eeabcdda33c745bfaaed33930d32a7367f3cfb2c79f3fd5aa5c3a42eb9735fabf72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarif-om python3.10dist(sarif-om) python310-sarif-om python3dist(sarif-om)"
RDEPENDS:${PN} += "python(abi) python310-attrs python310-pbr"

inherit rpm
