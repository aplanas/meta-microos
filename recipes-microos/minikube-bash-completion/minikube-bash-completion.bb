SUMMARY = "Minikube bash completion"
DESCRIPTION = "Optional bash completion for minikube."
LICENSE = "Apache-2.0"

PV = "1.30.1"

RPM_NAME = "minikube-bash-completion-1.30.1-1.1.noarch.rpm"
RPM_HASH = "aace89bed184afb707f495cdd2465f487115605155f3de35776d5de9c4c0eb0100a8f1ea15e8775e97482b9ff5ab98cd69f525d32924af89830c387b17f70f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minikube-bash-completion"
RDEPENDS:${PN} += "bash bash-completion minikube"

inherit rpm
