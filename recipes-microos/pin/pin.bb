SUMMARY = "A tool for finding package information"
DESCRIPTION = "Pin - Package InformatioN. Pin searches the installed packages (rpm \
-qi, -ql) and the ARCHIVES.gz file for the desired information. It \
shows README, README.SuSE, and FAQ, when available."
LICENSE = "GPL-2.0+"

PV = "0.40"

RPM_NAME = "pin-0.40-2.11.noarch.rpm"
RPM_HASH = "0aabbabfa9944bf38a1f9184ed32134a6865525ecaa56177ad117d590f24f49f6f282ffb1d66998ed26709d95cd31f501895e0fa74be4d776ad72f7376b7a863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pin"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
