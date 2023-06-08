SUMMARY = "Cubic-to-quadratic bezier curve conversion"
DESCRIPTION = "Cubic-to-quadratic bezier curve conversion"
LICENSE = "Apache-2.0"

PV = "1.6.7.post2"

RPM_NAME = "python311-cu2qu-1.6.7.post2-1.4.aarch64.rpm"
RPM_HASH = "cd1bd5b71da221aa49c43988b02389c53824141e2bd46033ce58be6aba60d065716a2e42fe3e8d1d9525cf2d01883f33ca07fb2e72583a91d4994ae96d287981"

RPROVIDES:${PN} += "python3.11dist(cu2qu) python311-cu2qu python311-cu2qu(aarch-64) python3dist(cu2qu)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-FontTools"

inherit rpm
