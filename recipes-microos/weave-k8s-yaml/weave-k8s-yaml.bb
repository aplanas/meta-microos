SUMMARY = "Kubernetes yaml file to run weave container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
weave container in a kubernetes cluster. \
 \
weave is a virtual network that gives a subnet to each host for use with \
container runtimes."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "weave-k8s-yaml-2.8.1-3.7.noarch.rpm"
RPM_HASH = "5d8bf4cafc32476163ae7e27d3fb12afb29fc54cfb21204bc92a4403468b122378fe6ea8d0ffa7d273d9a1eed525cf634d61834218492187ed28e4ad21d9f126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "weave-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
