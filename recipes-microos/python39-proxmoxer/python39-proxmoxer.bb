SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-proxmoxer-2.0.1-1.2.noarch.rpm"
RPM_HASH = "1a517330f7bcde11a05f6a38a5090278b6df451c2114deefe4f8e040cdbc7412465f85b17dfd7b904c3a07a33c56ae6793ced46d5eebc26ba301b1fa4973e5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(proxmoxer) python39-proxmoxer python3dist(proxmoxer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
