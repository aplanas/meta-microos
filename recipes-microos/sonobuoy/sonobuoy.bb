SUMMARY = "Conformance test suite for diagnosing a Kubernetes cluster"
DESCRIPTION = "Sonobuoy is a diagnostic tool for understanding the state of a \
Kubernetes cluster by running a set of Kubernetes conformance tests \
in an accessible and non-destructive manner."
LICENSE = "Apache-2.0"

PV = "0.20.0"

RPM_NAME = "sonobuoy-0.20.0-1.7.aarch64.rpm"
RPM_HASH = "74245c574f1d498f9847d2b40f8236de6dfe1856640da11c065acd9254b9d53440b72d767cee4d996f084102362b5490eda4a519286398120b0f276a1f403976"

RPROVIDES:${PN} += "sonobuoy sonobuoy(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
