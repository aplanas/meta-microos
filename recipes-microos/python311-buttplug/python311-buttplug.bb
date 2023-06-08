SUMMARY = "Implementations of the Buttplug Client for Python"
DESCRIPTION = "Buttplug-py is a python implementation of the Core and Client portions of \
the Buttplug Sex Toy Control Protocol. It allows users to write applications \
that can connect to Buttplug Servers, such as the Intiface Desktop \
Application or Intiface C# CLI or Node CLI."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python311-buttplug-0.2.0-4.6.noarch.rpm"
RPM_HASH = "20a354dced12be267e27508ef2cb3dca3cab8ca65f086262cd50ebec4ac732b980c39bccdfbc7098e32b9059df953b55ad5a142921890dfb5b823709fe5619df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(buttplug) python311-buttplug python3dist(buttplug)"
RDEPENDS:${PN} += "python(abi) python311-websockets"

inherit rpm
