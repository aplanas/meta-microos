SUMMARY = "Tool to show who has permissions to verbs and resources in Kubernetes"
DESCRIPTION = "kubectl-who-can shows who has permissions \
to <verb> <resources> in kubernetes"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "kubectl-who-can-0.3.0-1.10.aarch64.rpm"
RPM_HASH = "2a74ee658306748984157473f9160a108594ddbfd1e4a9db643f8994ae69657d274b2828f3b575087fee6b2a26d926d81f2aea3427b9a75c5188f952e0b4454a"

RPROVIDES:${PN} += "kubectl-who-can kubectl-who-can(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
