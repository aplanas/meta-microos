SUMMARY = "A Python module designed to control the Elgato brand Lights"
DESCRIPTION = "A Python module designed to control the Elgato brand Lights. For use in \
automation or in lieu of their Control Center app (when on a non-supported \
platform)."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "python39-leglight-0.2.0-1.6.aarch64.rpm"
RPM_HASH = "173003087700a871e1196abc357f3adca5b729ea530e2aca13646ecd14c963f710320733f3060b56d68e1faaa19d4a104e3d0988c9efa30ffe1df039cdb6d448"

RPROVIDES:${PN} += "python3.9dist(leglight) python39-leglight python39-leglight(aarch-64) python3dist(leglight)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-zeroconf"

inherit rpm
