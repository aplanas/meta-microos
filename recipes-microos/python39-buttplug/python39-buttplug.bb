SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-buttplug-0.2.0-4.6.noarch.rpm"
RPM_HASH = "78a4a066efc575d2590489eee5f9afb5c50808642d3b61ea04ed1f9853298210dff7df0e5142480f6e99bc190649438c08206b69205c8b2a83c4f28cfb650329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(buttplug) \
python39-buttplug \
python3dist(buttplug)"
RDEPENDS:${PN} += "python(abi) \
python39-websockets"

inherit rpm
