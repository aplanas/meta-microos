SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python311-portpicker-1.5.2-1.5.noarch.rpm"
RPM_HASH = "291fe751191e5131c21f67277e4309ab8543afe5edd342a6ce83c49b111c04c793432df300c1ba1eeed41a5ab5dde4f17dc94610d3d50c1f50d7c2899cf8613b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(portpicker) python311-portpicker python3dist(portpicker)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
