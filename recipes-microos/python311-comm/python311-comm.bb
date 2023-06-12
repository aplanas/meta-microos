SUMMARY = "Jupyter Python Comm implementation"
DESCRIPTION = "Comm provides a way to register a Kernel Comm implementation, \
as per the Jupyter kernel protocol. It also provides a base \
Comm implementation and a default CommManager that can be used."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-comm-0.1.3-1.1.noarch.rpm"
RPM_HASH = "4a5ceecf9674f814c618b0a8d58c67ad5041f26a3dfd0cb514d65510ca55a5f978654e501baaeb2ddda65abb9439fd2f9b1a43657825f5fc805bc7408bb5aa17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(comm) \
python311-comm \
python3dist(comm)"
RDEPENDS:${PN} += "python(abi) \
python311-traitlets"

inherit rpm
