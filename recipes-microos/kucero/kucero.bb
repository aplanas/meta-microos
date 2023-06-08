SUMMARY = "Kubernetes control plane certificate auto rotation"
DESCRIPTION = "A Kubernetes daemonset to perform automatic control plane certificate rotation."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "kucero-1.6.2-1.2.aarch64.rpm"
RPM_HASH = "c538b5d953727aab24cc9584282653d4fa86d9257e99987f4f5bd41515e5ed2b9b2c87072b71dd8d20ec6023fcd0507f889f78ca45d35edd2db6d25baa22ab90"

RPROVIDES:${PN} += "kucero kucero(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
