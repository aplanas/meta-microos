SUMMARY = "Extended pickling support for Python objects"
DESCRIPTION = "The cloudpickle package makes it possible to serialize Python constructs \
not supported by the default pickle module from the Python standard \
library. \
 \
cloudpickle is especially useful for cluster computing where Python \
expressions are shipped over the network to execute on remote hosts, \
possibly close to the data. \
 \
Among other things, cloudpickle supports pickling for lambda expressions, \
functions and classes defined interactively in the __main__ module."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python39-cloudpickle-2.2.1-1.1.noarch.rpm"
RPM_HASH = "bb8ba19bbe560935030dcf83748a871bc0349ba3e30091e25bf55e461039c09444e348ccacd5f7f10cb5cb555c375745bfdf907dc75eb464b2bb30b34a1f123d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cloudpickle) python39-cloudpickle python3dist(cloudpickle)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
