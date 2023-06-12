SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-pyusb-1.2.1-1.8.noarch.rpm"
RPM_HASH = "3e7f41150c5fc479cd54ffdbfb1b64d2628be42d0568370c36f13bbf25fcf73a81061acac3960efcc81057c0a9e1056db27eb67df8b9bb200c5e6f60e17594ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyusb) \
python311-pyusb \
python311-usb \
python3dist(pyusb)"
RDEPENDS:${PN} += "libusb-1_0-0 \
python(abi)"

inherit rpm
