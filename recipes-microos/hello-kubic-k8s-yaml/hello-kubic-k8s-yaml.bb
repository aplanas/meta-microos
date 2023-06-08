SUMMARY = "Kubernetes yaml file to run hello-kubic container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
hello-kubic container in a kubernetes cluster. \
 \
hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-k8s-yaml-1.4.1-1.5.noarch.rpm"
RPM_HASH = "a9d37dd82610c444c2b17e5db6c356aa0f51e3be77db39888484487b1da9f3c55455df9bb029a87fd99180bea4a3cc5244dbe4fe2bf2ada58578502374061118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hello-kubic-k8s-yaml"
RDEPENDS:${PN} += ""

inherit rpm
