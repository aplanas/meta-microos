SUMMARY = "YAML manifests used to install kubevirt"
DESCRIPTION = "This contains the built YAML manifests used to install kubevirt into a \
kubernetes installation with kubectl apply."
LICENSE = "Apache-2.0"

PV = "0.59.0"

RPM_NAME = "kubevirt-manifests-0.59.0-3.1.aarch64.rpm"
RPM_HASH = "b414364a4d71a2bf1794a02d7a69b68565f05bd365677ebe41d56274336667f2995eedeba61020a595917f90416866c38ac15ce15c079f99a29713c588f9e7c0"

RPROVIDES:${PN} += "kubevirt-manifests kubevirt-manifests(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
