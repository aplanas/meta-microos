SUMMARY = "Python Wrapper for the Proxmox 2x API (HTTP and SSH)"
DESCRIPTION = "Python Wrapper for the Proxmox 2.x API (HTTP and SSH)"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-proxmoxer-2.0.1-1.2.noarch.rpm"
RPM_HASH = "a13de99261e22691e015d2d5c4274e6ea668d137d1fbec62c83497241a7f0948d598576f9ac061efbb02fcfe2f7e2142acca15a27ca8110545122c9c5ee52dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proxmoxer \
python3.10dist(proxmoxer) \
python310-proxmoxer \
python3dist(proxmoxer)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
