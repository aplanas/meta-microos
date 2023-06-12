SUMMARY = "Tool to show who has permissions to verbs and resources in Kubernetes"
DESCRIPTION = "kubectl-who-can shows who has permissions \
to <verb> <resources> in kubernetes"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "kubectl-who-can-0.3.0-1.11.aarch64.rpm"
RPM_HASH = "cf3e1a92a3bdd29f786124b9031a8876068bbfb3b34cf52cb621d8542db1ce5e00a38b0c50d463cd081961d57c2ccb11b223fb40802f2df45b30d131510a4d72"

RPROVIDES:${PN} += "kubectl-who-can kubectl-who-can(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
