SUMMARY = "HTCondor Keyboard Daemon"
DESCRIPTION = "The condor_kbdd monitors logged in X users for activity. It is only \
useful on systems where no device (e.g. /dev/*) can be used to \
determine console idle time."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-kbdd-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "d66b49d4f7e07c2ac801f78792c124ed981422878c30090062abb25e54dbf587e1d20c1fcd974680b4cffa78cadf9079846bc0f5b2f241a4fd6a3ae4bc0aee75"

RPROVIDES:${PN} += "htcondor-kbdd htcondor-kbdd(aarch-64)"
RDEPENDS:${PN} += "htcondor htcondor-classads"

inherit rpm
