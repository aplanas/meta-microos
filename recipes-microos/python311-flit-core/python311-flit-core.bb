SUMMARY = "Distribution-building parts of Flit"
DESCRIPTION = "This provides a PEP 517 build backend for packages using Flit. \
The only public interface is the API specified by PEP 517, at flit_core.buildapi."
LICENSE = "BSD-3-Clause & MIT"

PV = "3.8.0"

RPM_NAME = "python311-flit-core-3.8.0-4.1.noarch.rpm"
RPM_HASH = "b9b4e92652cd69c1698ed0f2e098a980e60f8a1ee33b7540b151b8c53f43421f7c78eac9403606eeca041f92c4d4495dbf66b88a607304ce2dfedabc44a843b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flit-core) python311-flit-core"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
