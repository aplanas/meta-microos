SUMMARY = "Integration of uGet with Opera"
DESCRIPTION = "Integration of the uGet Download Manager with Opera."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "opera-uget-integrator-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "e80a698f4f0e263c55de01e8fb10b9c437dfda50d28f9cee8b96f34aa1bb45ca59db4a5cfa1a5c36f4b2006ada1df346d6382dcfef554fdfbcc0b7c5e44714d1"

RPROVIDES:${PN} += "config(opera-uget-integrator) \
opera-uget-integrator \
opera-uget-integrator(aarch-64)"
RDEPENDS:${PN} += "uget-integrator"

inherit rpm
